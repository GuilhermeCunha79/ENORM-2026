package pt.isep.enorm.ref.youtube.service;

import java.time.Instant;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.youtube.domain.Comment;
import pt.isep.enorm.ref.youtube.domain.CommentModerationCheck;
import pt.isep.enorm.ref.youtube.domain.Report;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.VideoModerationCheck;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.CommentModerationResult;
import pt.isep.enorm.ref.youtube.domain.enums.CommentModerationType;
import pt.isep.enorm.ref.youtube.domain.enums.ContentStatus;
import pt.isep.enorm.ref.youtube.domain.enums.ReportStatus;
import pt.isep.enorm.ref.youtube.domain.enums.VideoModerationResult;
import pt.isep.enorm.ref.youtube.domain.enums.VideoModerationType;
import pt.isep.enorm.ref.youtube.repository.CommentModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.CommentSettingsChangeRepository;
import pt.isep.enorm.ref.youtube.repository.ReportRepository;
import pt.isep.enorm.ref.youtube.repository.VideoModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationService;
import pt.isep.enorm.ref.youtube.service.projection.ModerationSimulationResult;
import pt.isep.enorm.ref.youtube.web.error.ResourceNotFoundException;

@Service
public class ModerationService extends GeneratedModerationService {

    private static final List<String> COPYRIGHT_SIGNALS = List.of("copyright", "pirated", "full movie", "leaked");
    private static final List<String> SPAM_SIGNALS = List.of("spam", "click here", "free money", "buy now", "promo");
    private static final List<String> TOXICITY_SIGNALS = List.of("hate", "kill", "idiot", "abuse", "harassment");
    private static final List<String> BLOCKED_WORD_SIGNALS = List.of("blockedword", "forbidden", "malware");

    private final VideoModerationCheckRepository videoModerationCheckRepository;
    private final CommentModerationCheckRepository commentModerationCheckRepository;
    private final VideoRepository videoRepository;
    private final CommentRepository commentRepository;
    private final ReportRepository reportRepository;

    public ModerationService(
        VideoModerationCheckRepository videoModerationCheckRepository,
        CommentModerationCheckRepository commentModerationCheckRepository,
        CommentSettingsChangeRepository commentSettingsChangeRepository,
        VideoRepository videoRepository,
        CommentRepository commentRepository,
        ReportRepository reportRepository
    ) {
        super(
            videoModerationCheckRepository,
            commentModerationCheckRepository,
            commentSettingsChangeRepository,
            videoRepository,
            commentRepository
        );
        this.videoModerationCheckRepository = videoModerationCheckRepository;
        this.commentModerationCheckRepository = commentModerationCheckRepository;
        this.videoRepository = videoRepository;
        this.commentRepository = commentRepository;
        this.reportRepository = reportRepository;
    }

    @Transactional
    public ModerationSimulationResult simulateVideoModeration(YoutubeUser moderator, Long videoId) {
        ensureModerator(moderator);

        Video video = loadVideo(videoId);
        VideoDecision decision = decideVideo(video.getTitle() + " " + video.getDescription());
        VideoModerationCheck check = saveVideoCheck(moderator, video, decision.getType(), decision.getResult());
        video.setStatus(decision.getStatus());
        videoRepository.save(video);

        return new ModerationSimulationResult(
            "VIDEO",
            video.getId(),
            check.getId(),
            null,
            decision.getSignal(),
            decision.getResult().name(),
            video.getStatus().name(),
            decision.getExplanation()
        );
    }

    @Transactional
    public ModerationSimulationResult simulateCommentModeration(YoutubeUser moderator, Long commentId) {
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
    public List<ModerationSimulationResult> simulatePendingReports(YoutubeUser moderator) {
        ensureModerator(moderator);

        return reportRepository.findByStatus(ReportStatus.PENDING)
            .stream()
            .map(report -> simulateReportReview(moderator, report))
            .toList();
    }

    private ModerationSimulationResult simulateReportReview(YoutubeUser moderator, Report report) {
        report.setReviewedBy(moderator);

        if (report.getVideo() != null) {
            return simulateVideoReport(moderator, report);
        }

        return simulateCommentReport(moderator, report);
    }

    private ModerationSimulationResult simulateVideoReport(YoutubeUser moderator, Report report) {
        Video video = report.getVideo();
        VideoDecision decision = decideVideo(video.getTitle() + " " + video.getDescription() + " " + report.getReason());
        VideoModerationCheck check = saveVideoCheck(moderator, video, decision.getType(), decision.getResult());

        video.setStatus(decision.getStatus());
        report.setStatus(decision.getStatus() == ContentStatus.REMOVED ? ReportStatus.REMOVED : ReportStatus.REVIEWED);

        videoRepository.save(video);
        reportRepository.save(report);

        return new ModerationSimulationResult(
            "VIDEO",
            video.getId(),
            check.getId(),
            report.getId(),
            decision.getSignal(),
            decision.getResult().name(),
            video.getStatus().name(),
            "Report review: " + decision.getExplanation()
        );
    }

    private ModerationSimulationResult simulateCommentReport(YoutubeUser moderator, Report report) {
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

    private VideoModerationCheck saveVideoCheck(
        YoutubeUser moderator,
        Video video,
        VideoModerationType type,
        VideoModerationResult result
    ) {
        VideoModerationCheck check = new VideoModerationCheck();
        check.setType(type);
        check.setResult(result);
        check.setTimestamp(Instant.now());
        check.setVideo(video);
        check.setReviewedBy(moderator);
        return videoModerationCheckRepository.save(check);
    }

    private CommentModerationCheck saveCommentCheck(
        YoutubeUser moderator,
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

    private VideoDecision decideVideo(String text) {
        String normalized = normalize(text);

        if (containsAny(normalized, COPYRIGHT_SIGNALS)) {
            return new VideoDecision(
                VideoModerationType.COPYRIGHT,
                VideoModerationResult.BLOCKED,
                ContentStatus.REMOVED,
                "copyright-risk",
                "Copyright-related signal found; simulated action removes the video."
            );
        }

        if (containsAny(normalized, SPAM_SIGNALS)) {
            return new VideoDecision(
                VideoModerationType.SPAM,
                VideoModerationResult.FLAGGED,
                ContentStatus.FLAGGED,
                "spam-risk",
                "Spam-like signal found; simulated action flags the video."
            );
        }

        if (containsAny(normalized, TOXICITY_SIGNALS)) {
            return new VideoDecision(
                VideoModerationType.CONTENT,
                VideoModerationResult.FLAGGED,
                ContentStatus.UNDER_REVIEW,
                "content-risk",
                "Potentially harmful content signal found; simulated action sends the video to review."
            );
        }

        return new VideoDecision(
            VideoModerationType.CONTENT,
            VideoModerationResult.APPROVED,
            ContentStatus.ACTIVE,
            "clean",
            "No moderation signal found; simulated action approves the video."
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

    private void ensureModerator(YoutubeUser moderator) {
        if (moderator == null) {
            throw new IllegalArgumentException("Moderator is required.");
        }
    }

    private Video loadVideo(Long videoId) {
        return videoRepository.findById(videoId)
            .orElseThrow(() -> new ResourceNotFoundException("Video '%s' was not found.".formatted(videoId)));
    }

    private Comment loadComment(Long commentId) {
        return commentRepository.findById(commentId)
            .orElseThrow(() -> new ResourceNotFoundException("Comment '%s' was not found.".formatted(commentId)));
    }

    private static final class VideoDecision {
        private final VideoModerationType type;
        private final VideoModerationResult result;
        private final ContentStatus status;
        private final String signal;
        private final String explanation;

        private VideoDecision(
            VideoModerationType type,
            VideoModerationResult result,
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

        private VideoModerationType getType() {
            return type;
        }

        private VideoModerationResult getResult() {
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

