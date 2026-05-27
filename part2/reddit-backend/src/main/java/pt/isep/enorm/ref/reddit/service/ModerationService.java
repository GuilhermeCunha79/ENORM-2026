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
// Simulation removed: no projection return types
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

    // Simulation APIs removed; add manual approve helpers instead.
    @Transactional
    public void approvePost(RedditUser moderator, Long postId) {
        ensureModerator(moderator);
        Post post = loadPost(postId);
        post.setStatus(ContentStatus.ACTIVE);
        postRepository.save(post);
    }

    @Transactional
    public void approveComment(RedditUser moderator, Long commentId) {
        ensureModerator(moderator);
        Comment comment = loadComment(commentId);
        comment.setStatus(ContentStatus.ACTIVE);
        commentRepository.save(comment);
    }

    @Transactional
    public void approveReport(RedditUser moderator, Long reportId) {
        ensureModerator(moderator);
        Report report = reportRepository.findById(reportId)
            .orElseThrow(() -> new ResourceNotFoundException("Report '%s' was not found.".formatted(reportId)));
        report.setReviewedBy(moderator);
        report.setStatus(ReportStatus.REVIEWED);
        reportRepository.save(report);
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



