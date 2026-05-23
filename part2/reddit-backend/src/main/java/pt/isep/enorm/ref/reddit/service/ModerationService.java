package pt.isep.enorm.ref.reddit.service;

import java.time.Instant;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.reddit.domain.Comment;
import pt.isep.enorm.ref.reddit.domain.CommentModerationCheck;
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.PostModerationCheck;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.Report;
import pt.isep.enorm.ref.reddit.domain.enums.CommentModerationResult;
import pt.isep.enorm.ref.reddit.domain.enums.CommentModerationType;
import pt.isep.enorm.ref.reddit.domain.enums.ContentStatus;
import pt.isep.enorm.ref.reddit.domain.enums.PostModerationResult;
import pt.isep.enorm.ref.reddit.domain.enums.PostModerationType;
import pt.isep.enorm.ref.reddit.domain.enums.ReportStatus;
import pt.isep.enorm.ref.reddit.repository.CommentModerationCheckRepository;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.CommunityRuleRepository;
import pt.isep.enorm.ref.reddit.repository.PostModerationCheckRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.repository.ReportRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedModerationService;
import pt.isep.enorm.ref.reddit.service.projection.ModerationSimulationResult;
import pt.isep.enorm.ref.reddit.web.error.ResourceNotFoundException;

@Service
public class ModerationService extends GeneratedModerationService {

    private static final List<String> COPYRIGHT_SIGNALS = List.of("copyright", "pirated", "full movie", "leaked");
    private static final List<String> SPAM_SIGNALS = List.of("spam", "click here", "free money", "buy now", "promo");
    private static final List<String> TOXICITY_SIGNALS = List.of("hate", "kill", "idiot", "abuse", "harassment");
    private static final List<String> BLOCKED_WORD_SIGNALS = List.of("blockedword", "forbidden", "malware");

    private final PostModerationCheckRepository postModerationCheckRepository;
    private final CommentModerationCheckRepository commentModerationCheckRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
    private final ReportRepository reportRepository;

    public ModerationService(
        PostModerationCheckRepository postModerationCheckRepository,
        CommentModerationCheckRepository commentModerationCheckRepository,
        CommunityRuleRepository commentSettingsChangeRepository,
        PostRepository postRepository,
        CommentRepository commentRepository,
        ReportRepository reportRepository
    ) {
        super(
            postModerationCheckRepository,
            commentModerationCheckRepository,
            commentSettingsChangeRepository,
            postRepository,
            commentRepository
        );
        this.postModerationCheckRepository = postModerationCheckRepository;
        this.commentModerationCheckRepository = commentModerationCheckRepository;
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
        this.reportRepository = reportRepository;
    }

    @Transactional
    public ModerationSimulationResult simulatePostModeration(RedditUser moderator, Long postId) {
        ensureModerator(moderator);

        Post post = loadPost(postId);
        PostDecision decision = decidePost(post.getTitle() + " " + post.getDescription());
        PostModerationCheck check = savePostCheck(moderator, post, decision.getType(), decision.getResult());
        post.setStatus(decision.getStatus());
        postRepository.save(post);

        return new ModerationSimulationResult(
            "POST",
            post.getId(),
            check.getId(),
            null,
            decision.getSignal(),
            decision.getResult().name(),
            post.getStatus().name(),
            decision.getExplanation()
        );
    }

    @Transactional
    public ModerationSimulationResult simulateCommentModeration(RedditUser moderator, Long commentId) {
        ensureModerator(moderator);

        Comment comment = loadComment(commentId);
        CommentDecision decision = decideComment(comment.getText());
        CommentModerationCheck check = saveCommentCheck(moderator, comment, decision.getType(), decision.getResult());
        comment.setStatus(decision.getStatus());
        commentRepository.save(comment);

        return new ModerationSimulationResult(
            "COMMENT",
            comment.getId(),
            check.getId(),
            null,
            decision.getSignal(),
            decision.getResult().name(),
            comment.getStatus().name(),
            decision.getExplanation()
        );
    }

    @Transactional
    public List<ModerationSimulationResult> simulatePendingReports(RedditUser moderator) {
        ensureModerator(moderator);

        return reportRepository.findByStatus(ReportStatus.PENDING)
            .stream()
            .map(report -> simulateReportReview(moderator, report))
            .toList();
    }

    private ModerationSimulationResult simulateReportReview(RedditUser moderator, Report report) {
        report.setReviewedBy(moderator);

        if (report.getPost() != null) {
            return simulatePostReport(moderator, report);
        }

        return simulateCommentReport(moderator, report);
    }

    private ModerationSimulationResult simulatePostReport(RedditUser moderator, Report report) {
        Post post = report.getPost();
        PostDecision decision = decidePost(post.getTitle() + " " + post.getDescription() + " " + report.getReason());
        PostModerationCheck check = savePostCheck(moderator, post, decision.getType(), decision.getResult());

        post.setStatus(decision.getStatus());
        report.setStatus(decision.getStatus() == ContentStatus.REMOVED ? ReportStatus.REMOVED : ReportStatus.REVIEWED);

        postRepository.save(post);
        reportRepository.save(report);

        return new ModerationSimulationResult(
            "POST",
            post.getId(),
            check.getId(),
            report.getId(),
            decision.getSignal(),
            decision.getResult().name(),
            post.getStatus().name(),
            "Report review: " + decision.getExplanation()
        );
    }

    private ModerationSimulationResult simulateCommentReport(RedditUser moderator, Report report) {
        Comment comment = report.getComment();
        CommentDecision decision = decideComment(comment.getText() + " " + report.getReason());
        CommentModerationCheck check = saveCommentCheck(moderator, comment, decision.getType(), decision.getResult());

        comment.setStatus(decision.getStatus());
        report.setStatus(decision.getStatus() == ContentStatus.REMOVED ? ReportStatus.REMOVED : ReportStatus.REVIEWED);

        commentRepository.save(comment);
        reportRepository.save(report);

        return new ModerationSimulationResult(
            "COMMENT",
            comment.getId(),
            check.getId(),
            report.getId(),
            decision.getSignal(),
            decision.getResult().name(),
            comment.getStatus().name(),
            "Report review: " + decision.getExplanation()
        );
    }

    private PostModerationCheck savePostCheck(
        RedditUser moderator,
        Post post,
        PostModerationType type,
        PostModerationResult result
    ) {
        PostModerationCheck check = new PostModerationCheck();
        check.setType(type);
        check.setResult(result);
        check.setTimestamp(Instant.now());
        check.setPost(post);
        check.setReviewedBy(moderator);
        return postModerationCheckRepository.save(check);
    }

    private CommentModerationCheck saveCommentCheck(
        RedditUser moderator,
        Comment comment,
        CommentModerationType type,
        CommentModerationResult result
    ) {
        CommentModerationCheck check = new CommentModerationCheck();
        check.setType(type);
        check.setResult(result);
        check.setTimestamp(Instant.now());
        check.setComment(comment);
        check.setReviewedBy(moderator);
        return commentModerationCheckRepository.save(check);
    }

    private PostDecision decidePost(String text) {
        String normalized = normalize(text);

        if (containsAny(normalized, COPYRIGHT_SIGNALS)) {
            return new PostDecision(
                PostModerationType.COPYRIGHT,
                PostModerationResult.BLOCKED,
                ContentStatus.REMOVED,
                "copyright-risk",
                "Copyright-related signal found; simulated action removes the post."
            );
        }

        if (containsAny(normalized, SPAM_SIGNALS)) {
            return new PostDecision(
                PostModerationType.SPAM,
                PostModerationResult.FLAGGED,
                ContentStatus.FLAGGED,
                "spam-risk",
                "Spam-like signal found; simulated action flags the post."
            );
        }

        if (containsAny(normalized, TOXICITY_SIGNALS)) {
            return new PostDecision(
                PostModerationType.CONTENT,
                PostModerationResult.FLAGGED,
                ContentStatus.UNDER_REVIEW,
                "content-risk",
                "Potentially harmful content signal found; simulated action sends the post to review."
            );
        }

        return new PostDecision(
            PostModerationType.CONTENT,
            PostModerationResult.APPROVED,
            ContentStatus.ACTIVE,
            "clean",
            "No moderation signal found; simulated action approves the post."
        );
    }

    private CommentDecision decideComment(String text) {
        String normalized = normalize(text);

        if (containsAny(normalized, BLOCKED_WORD_SIGNALS)) {
            return new CommentDecision(
                CommentModerationType.BLOCKED_WORD,
                CommentModerationResult.HIDDEN,
                ContentStatus.REMOVED,
                "blocked-word",
                "Blocked word signal found; simulated action hides the comment."
            );
        }

        if (containsAny(normalized, TOXICITY_SIGNALS)) {
            return new CommentDecision(
                CommentModerationType.TOXICITY,
                CommentModerationResult.HIDDEN,
                ContentStatus.REMOVED,
                "toxicity-risk",
                "Toxicity signal found; simulated action hides the comment."
            );
        }

        if (containsAny(normalized, SPAM_SIGNALS)) {
            return new CommentDecision(
                CommentModerationType.SPAM,
                CommentModerationResult.FLAGGED,
                ContentStatus.FLAGGED,
                "spam-risk",
                "Spam-like signal found; simulated action flags the comment."
            );
        }

        return new CommentDecision(
            CommentModerationType.SPAM,
            CommentModerationResult.APPROVED,
            ContentStatus.ACTIVE,
            "clean",
            "No moderation signal found; simulated action approves the comment."
        );
    }

    private boolean containsAny(String text, List<String> signals) {
        return signals.stream().anyMatch(text::contains);
    }

    private String normalize(String text) {
        if (text == null) {
            return "";
        }
        return text.toLowerCase(Locale.ROOT);
    }

    private void ensureModerator(RedditUser moderator) {
        if (moderator == null) {
            throw new IllegalArgumentException("Moderator is required.");
        }
    }

    private Post loadPost(Long postId) {
        return postRepository.findById(postId)
            .orElseThrow(() -> new ResourceNotFoundException("Post '%s' was not found.".formatted(postId)));
    }

    private Comment loadComment(Long commentId) {
        return commentRepository.findById(commentId)
            .orElseThrow(() -> new ResourceNotFoundException("Comment '%s' was not found.".formatted(commentId)));
    }

    private static final class PostDecision {
        private final PostModerationType type;
        private final PostModerationResult result;
        private final ContentStatus status;
        private final String signal;
        private final String explanation;

        private PostDecision(
            PostModerationType type,
            PostModerationResult result,
            ContentStatus status,
            String signal,
            String explanation
        ) {
            this.type = type;
            this.result = result;
            this.status = status;
            this.signal = signal;
            this.explanation = explanation;
        }

        private PostModerationType getType() {
            return type;
        }

        private PostModerationResult getResult() {
            return result;
        }

        private ContentStatus getStatus() {
            return status;
        }

        private String getSignal() {
            return signal;
        }

        private String getExplanation() {
            return explanation;
        }
    }

    private static final class CommentDecision {
        private final CommentModerationType type;
        private final CommentModerationResult result;
        private final ContentStatus status;
        private final String signal;
        private final String explanation;

        private CommentDecision(
            CommentModerationType type,
            CommentModerationResult result,
            ContentStatus status,
            String signal,
            String explanation
        ) {
            this.type = type;
            this.result = result;
            this.status = status;
            this.signal = signal;
            this.explanation = explanation;
        }

        private CommentModerationType getType() {
            return type;
        }

        private CommentModerationResult getResult() {
            return result;
        }

        private ContentStatus getStatus() {
            return status;
        }

        private String getSignal() {
            return signal;
        }

        private String getExplanation() {
            return explanation;
        }
    }
}



