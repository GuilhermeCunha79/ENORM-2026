package pt.isep.enorm.ref.youtube.service;

import java.time.Instant;
import java.util.ArrayList;
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
import pt.isep.enorm.ref.youtube.domain.enums.ContentStatus;
import pt.isep.enorm.ref.youtube.domain.enums.ReportStatus;
import pt.isep.enorm.ref.youtube.domain.enums.Role;
import pt.isep.enorm.ref.youtube.domain.enums.VideoModerationResult;
import pt.isep.enorm.ref.youtube.repository.CommentModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.CommentSettingsChangeRepository;
import pt.isep.enorm.ref.youtube.repository.ReportRepository;
import pt.isep.enorm.ref.youtube.repository.VideoModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationModel;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationModel.ModerationDecision;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationModel.ModerationMode;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationService;
import pt.isep.enorm.ref.youtube.service.projection.ModerationSimulationResult;
import pt.isep.enorm.ref.youtube.web.error.ResourceNotFoundException;

@Service
public class ModerationService extends GeneratedModerationService {

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
    public void approveVideo(YoutubeUser moderator, Long videoId) {
        ensureModerator(moderator);
        Video video = loadVideo(videoId);
        video.setStatus(ContentStatus.ACTIVE);
        videoRepository.save(video);
    }

    @Transactional
    public void approveComment(YoutubeUser moderator, Long commentId) {
        ensureModerator(moderator);
        Comment comment = loadComment(commentId);
        comment.setStatus(ContentStatus.ACTIVE);
        commentRepository.save(comment);
    }

    @Transactional
    public void approveReport(YoutubeUser moderator, Long reportId) {
        ensureModerator(moderator);
        Report report = reportRepository.findById(reportId)
            .orElseThrow(() -> new ResourceNotFoundException("Report '%s' was not found.".formatted(reportId)));
        report.setReviewedBy(moderator);
        report.setStatus(ReportStatus.REVIEWED);
        reportRepository.save(report);
    }

    @Transactional
    public ModerationSimulationResult simulateVideoModeration(YoutubeUser moderator, Long videoId) {
        ensureModerator(moderator);
        return moderateVideo(moderator, loadVideo(videoId));
    }

    @Transactional
    public ModerationSimulationResult simulateCommentModeration(YoutubeUser moderator, Long commentId) {
        ensureModerator(moderator);
        return moderateComment(moderator, loadComment(commentId));
    }

    @Transactional
    public List<ModerationSimulationResult> simulateReportModeration(YoutubeUser moderator) {
        ensureModerator(moderator);
        List<ModerationSimulationResult> results = new ArrayList<>();

        for (Report report : reportRepository.findByStatus(ReportStatus.PENDING)) {
            if (report.getVideo() != null) {
                results.add(moderateReportedVideo(moderator, report));
            } else if (report.getComment() != null) {
                results.add(moderateReportedComment(moderator, report));
            }
        }

        return results;
    }

    private ModerationSimulationResult moderateVideo(YoutubeUser moderator, Video video) {
        List<String> matches = findMatchedKeywords(
            video.getTitle() + " " + video.getDescription(),
            GeneratedModerationModel.VIDEO_BLOCKED_KEYWORDS
        );
        VideoModerationResult decision = matches.isEmpty()
            ? VideoModerationResult.APPROVED
            : GeneratedModerationModel.VIDEO_DECISION_ON_MATCH;
        ContentStatus status = matches.isEmpty()
            ? ContentStatus.ACTIVE
            : statusFor(GeneratedModerationModel.VIDEO_POLICY_DECISION, GeneratedModerationModel.VIDEO_POLICY_MODE);

        video.setStatus(status);
        videoRepository.save(video);

        VideoModerationCheck check = saveVideoCheck(moderator, video, decision);

        return result(
            "VIDEO",
            video.getId(),
            check.getId(),
            null,
            GeneratedModerationModel.VIDEO_POLICY_TRIGGER.name(),
            GeneratedModerationModel.VIDEO_POLICY_MODE.name(),
            decision.name(),
            status,
            matches,
            explanation(
                GeneratedModerationModel.VIDEO_AUTOMATION_RULE_NAME,
                GeneratedModerationModel.VIDEO_ACTION_NAME,
                GeneratedModerationModel.VIDEO_ACTION_KIND.name(),
                GeneratedModerationModel.VIDEO_POLICY_NAME,
                matches,
                decision.name()
            )
        );
    }

    private ModerationSimulationResult moderateComment(YoutubeUser moderator, Comment comment) {
        List<String> matches = findMatchedKeywords(comment.getText(), GeneratedModerationModel.COMMENT_BLOCKED_KEYWORDS);
        CommentModerationResult decision = matches.isEmpty()
            ? CommentModerationResult.APPROVED
            : GeneratedModerationModel.COMMENT_DECISION_ON_MATCH;
        ContentStatus status = matches.isEmpty()
            ? ContentStatus.ACTIVE
            : statusFor(GeneratedModerationModel.COMMENT_POLICY_DECISION, GeneratedModerationModel.COMMENT_POLICY_MODE);

        comment.setStatus(status);
        commentRepository.save(comment);

        CommentModerationCheck check = saveCommentCheck(moderator, comment, decision);

        return result(
            "COMMENT",
            comment.getId(),
            check.getId(),
            null,
            GeneratedModerationModel.COMMENT_POLICY_TRIGGER.name(),
            GeneratedModerationModel.COMMENT_POLICY_MODE.name(),
            decision.name(),
            status,
            matches,
            explanation(
                GeneratedModerationModel.COMMENT_AUTOMATION_RULE_NAME,
                GeneratedModerationModel.COMMENT_ACTION_NAME,
                GeneratedModerationModel.COMMENT_ACTION_KIND.name(),
                GeneratedModerationModel.COMMENT_POLICY_NAME,
                matches,
                decision.name()
            )
        );
    }

    private ModerationSimulationResult moderateReportedVideo(YoutubeUser moderator, Report report) {
        Video video = report.getVideo();
        ContentStatus status = statusFor(
            GeneratedModerationModel.REPORT_POLICY_DECISION,
            GeneratedModerationModel.REPORT_POLICY_MODE
        );

        video.setStatus(status);
        videoRepository.save(video);

        VideoModerationCheck check = saveVideoCheck(moderator, video, VideoModerationResult.BLOCKED);
        closeReport(report, moderator, status);

        return result(
            "VIDEO",
            video.getId(),
            check.getId(),
            report,
            GeneratedModerationModel.REPORT_POLICY_TRIGGER.name(),
            GeneratedModerationModel.REPORT_POLICY_MODE.name(),
            GeneratedModerationModel.REPORT_POLICY_DECISION.name(),
            status,
            List.of(),
            GeneratedModerationModel.REPORT_AUTOMATION_RULE_NAME
                + " applies " + GeneratedModerationModel.REPORT_ACTION_NAME
                + " using " + GeneratedModerationModel.REPORT_ACTION_KIND
                + "; " + GeneratedModerationModel.REPORT_POLICY_NAME
                + " records decision " + GeneratedModerationModel.REPORT_POLICY_DECISION
                + "."
        );
    }

    private ModerationSimulationResult moderateReportedComment(YoutubeUser moderator, Report report) {
        Comment comment = report.getComment();
        ContentStatus status = statusFor(
            GeneratedModerationModel.REPORT_POLICY_DECISION,
            GeneratedModerationModel.REPORT_POLICY_MODE
        );

        comment.setStatus(status);
        commentRepository.save(comment);

        CommentModerationCheck check = saveCommentCheck(moderator, comment, CommentModerationResult.HIDDEN);
        closeReport(report, moderator, status);

        return result(
            "COMMENT",
            comment.getId(),
            check.getId(),
            report,
            GeneratedModerationModel.REPORT_POLICY_TRIGGER.name(),
            GeneratedModerationModel.REPORT_POLICY_MODE.name(),
            GeneratedModerationModel.REPORT_POLICY_DECISION.name(),
            status,
            List.of(),
            GeneratedModerationModel.REPORT_AUTOMATION_RULE_NAME
                + " applies " + GeneratedModerationModel.REPORT_ACTION_NAME
                + " using " + GeneratedModerationModel.REPORT_ACTION_KIND
                + "; " + GeneratedModerationModel.REPORT_POLICY_NAME
                + " records decision " + GeneratedModerationModel.REPORT_POLICY_DECISION
                + "."
        );
    }

    private List<String> findMatchedKeywords(String content, List<String> keywords) {
        String normalized = normalize(content);
        List<String> matches = new ArrayList<>();
        for (String keyword : keywords) {
            if (normalized.contains(keyword.toLowerCase(Locale.ROOT))) {
                matches.add(keyword);
            }
        }
        return matches;
    }

    private ContentStatus statusFor(ModerationDecision decision, ModerationMode mode) {
        if (decision == ModerationDecision.APPROVED) {
            return ContentStatus.ACTIVE;
        }
        if (decision == ModerationDecision.FLAGGED) {
            return mode == ModerationMode.MANUAL ? ContentStatus.UNDER_REVIEW : ContentStatus.FLAGGED;
        }
        return ContentStatus.REMOVED;
    }

    private String explanation(
        String automationRule,
        String actionName,
        String actionKind,
        String policyName,
        List<String> matches,
        String decision
    ) {
        if (matches.isEmpty()) {
            return "No generated keyword condition matched; " + policyName + " approved content.";
        }
        return automationRule
            + " matched " + matches
            + "; " + actionName
            + " uses " + actionKind
            + "; " + policyName
            + " records decision " + decision
            + ".";
    }

    private ModerationSimulationResult result(
        String targetType,
        Long targetId,
        Long checkId,
        Report report,
        String trigger,
        String mode,
        String decision,
        ContentStatus status,
        List<String> matches,
        String explanation
    ) {
        return new ModerationSimulationResult(
            targetType,
            targetId,
            checkId,
            report == null ? null : report.getId(),
            trigger,
            mode,
            decision,
            status.name(),
            matches,
            explanation
        );
    }

    private void closeReport(Report report, YoutubeUser moderator, ContentStatus status) {
        report.setReviewedBy(moderator);
        report.setStatus(status == ContentStatus.REMOVED ? ReportStatus.REMOVED : ReportStatus.REVIEWED);
        reportRepository.save(report);
    }

    private VideoModerationCheck saveVideoCheck(YoutubeUser moderator, Video video, VideoModerationResult result) {
        VideoModerationCheck check = new VideoModerationCheck();
        check.setType(GeneratedModerationModel.VIDEO_CHECK_TYPE);
        check.setResult(result);
        check.setTimestamp(Instant.now());
        check.setVideo(video);
        check.setReviewedBy(moderator);
        return videoModerationCheckRepository.save(check);
    }

    private CommentModerationCheck saveCommentCheck(YoutubeUser moderator, Comment comment, CommentModerationResult result) {
        CommentModerationCheck check = new CommentModerationCheck();
        check.setType(GeneratedModerationModel.COMMENT_CHECK_TYPE);
        check.setResult(result);
        check.setTimestamp(Instant.now());
        check.setComment(comment);
        check.setReviewedBy(moderator);
        return commentModerationCheckRepository.save(check);
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
        if (moderator.getRole() != Role.MODERATOR) {
            throw new IllegalArgumentException("Moderation policies require MODERATOR.");
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
}
