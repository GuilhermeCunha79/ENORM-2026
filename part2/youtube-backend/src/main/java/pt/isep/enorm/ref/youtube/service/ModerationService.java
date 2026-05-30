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
import pt.isep.enorm.ref.youtube.domain.enums.VideoModerationResult;
import pt.isep.enorm.ref.youtube.repository.CommentModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.CommentSettingsChangeRepository;
import pt.isep.enorm.ref.youtube.repository.ReportRepository;
import pt.isep.enorm.ref.youtube.repository.VideoModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationModel;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationModel.ActionSpec;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationModel.AutomationRuleSpec;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationModel.ConditionSpec;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationModel.ModerationDecision;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationModel.ModerationMode;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationModel.PolicySpec;
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
        PolicySpec policy = GeneratedModerationModel.VIDEO_POLICY;
        AutomationRuleSpec rule = primaryRule(policy);
        List<String> matches = findMatchedKeywords(
            video.getTitle() + " " + video.getDescription(),
            ruleConditions(rule)
        );
        VideoModerationResult decision = matches.isEmpty()
            ? VideoModerationResult.APPROVED
            : GeneratedModerationModel.VIDEO_DECISION_ON_MATCH;
        ContentStatus status = matches.isEmpty()
            ? ContentStatus.ACTIVE
            : statusFor(
                policy.getDecision(),
                policy.getMode(),
                primaryAction(rule)
            );

        video.setStatus(status);
        videoRepository.save(video);

        VideoModerationCheck check = saveVideoCheck(moderator, video, decision);

        return result(
            "VIDEO",
            video.getId(),
            check.getId(),
            null,
            policy.getTrigger().name(),
            policy.getMode().name(),
            decision.name(),
            status,
            matches,
            explanation(
                ruleName(rule),
                primaryAction(rule),
                policy.getName(),
                matches,
                decision.name()
            )
        );
    }

    private ModerationSimulationResult moderateComment(YoutubeUser moderator, Comment comment) {
        PolicySpec policy = GeneratedModerationModel.COMMENT_POLICY;
        AutomationRuleSpec rule = primaryRule(policy);
        List<String> matches = findMatchedKeywords(comment.getText(), ruleConditions(rule));
        CommentModerationResult decision = matches.isEmpty()
            ? CommentModerationResult.APPROVED
            : GeneratedModerationModel.COMMENT_DECISION_ON_MATCH;
        ContentStatus status = matches.isEmpty()
            ? ContentStatus.ACTIVE
            : statusFor(
                policy.getDecision(),
                policy.getMode(),
                primaryAction(rule)
            );

        comment.setStatus(status);
        commentRepository.save(comment);

        CommentModerationCheck check = saveCommentCheck(moderator, comment, decision);

        return result(
            "COMMENT",
            comment.getId(),
            check.getId(),
            null,
            policy.getTrigger().name(),
            policy.getMode().name(),
            decision.name(),
            status,
            matches,
            explanation(
                ruleName(rule),
                primaryAction(rule),
                policy.getName(),
                matches,
                decision.name()
            )
        );
    }

    private ModerationSimulationResult moderateReportedVideo(YoutubeUser moderator, Report report) {
        PolicySpec policy = GeneratedModerationModel.REPORT_POLICY;
        AutomationRuleSpec rule = primaryRule(policy);
        Video video = report.getVideo();
        List<String> conditionMatches = findConditionMatches(report.getStatus().name(), ruleConditions(rule));
        ActionSpec action = conditionMatches.isEmpty() ? null : primaryAction(rule);
        ContentStatus status = statusFor(
            policy.getDecision(),
            policy.getMode(),
            action
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
            policy.getTrigger().name(),
            policy.getMode().name(),
            policy.getDecision().name(),
            status,
            conditionMatches,
            ruleName(rule)
                + " matched report conditions " + conditionMatches
                + "; applies " + actionName(action)
                + " using " + actionKind(action)
                + "; " + policy.getName()
                + " records decision " + policy.getDecision()
                + "."
        );
    }

    private ModerationSimulationResult moderateReportedComment(YoutubeUser moderator, Report report) {
        PolicySpec policy = GeneratedModerationModel.REPORT_POLICY;
        AutomationRuleSpec rule = primaryRule(policy);
        Comment comment = report.getComment();
        List<String> conditionMatches = findConditionMatches(report.getStatus().name(), ruleConditions(rule));
        ActionSpec action = conditionMatches.isEmpty() ? null : primaryAction(rule);
        ContentStatus status = statusFor(
            policy.getDecision(),
            policy.getMode(),
            action
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
            policy.getTrigger().name(),
            policy.getMode().name(),
            policy.getDecision().name(),
            status,
            conditionMatches,
            ruleName(rule)
                + " matched report conditions " + conditionMatches
                + "; applies " + actionName(action)
                + " using " + actionKind(action)
                + "; " + policy.getName()
                + " records decision " + policy.getDecision()
                + "."
        );
    }

    private List<String> findMatchedKeywords(String content, List<ConditionSpec> conditions) {
        String normalized = normalize(content);
        List<String> matches = new ArrayList<>();
        for (ConditionSpec condition : conditions) {
            if (condition.getOperator() != GeneratedModerationModel.ConditionOperator.CONTAINS_KEYWORDS) {
                continue;
            }
            for (String keyword : condition.getValues()) {
                if (normalized.contains(keyword.toLowerCase(Locale.ROOT))) {
                    matches.add(keyword);
                }
            }
        }
        return matches;
    }

    private List<String> findConditionMatches(String value, List<ConditionSpec> conditions) {
        String normalized = normalize(value);
        List<String> matches = new ArrayList<>();
        for (ConditionSpec condition : conditions) {
            if (condition.getOperator() == GeneratedModerationModel.ConditionOperator.HAS_PROPERTY && !normalized.isBlank()) {
                matches.add(condition.getAttribute());
                continue;
            }
            if (condition.getOperator() != GeneratedModerationModel.ConditionOperator.HAS_SPECIFIC_PROPERTY) {
                continue;
            }
            for (String expectedValue : condition.getValues()) {
                if (normalized.equals(expectedValue.toLowerCase(Locale.ROOT))) {
                    matches.add(expectedValue);
                }
            }
        }
        return matches;
    }

    private ContentStatus statusFor(ModerationDecision decision, ModerationMode mode, ActionSpec action) {
        if (decision == ModerationDecision.APPROVED) {
            return ContentStatus.ACTIVE;
        }
        if (action != null) {
            return switch (action.getKind()) {
                case FLAG_CONTENT -> mode == ModerationMode.MANUAL ? ContentStatus.UNDER_REVIEW : ContentStatus.FLAGGED;
                case HIDE_CONTENT -> ContentStatus.REMOVED;
                case NOTIFY_MODERATOR -> ContentStatus.UNDER_REVIEW;
            };
        }
        if (decision == ModerationDecision.FLAGGED) {
            return mode == ModerationMode.MANUAL ? ContentStatus.UNDER_REVIEW : ContentStatus.FLAGGED;
        }
        return ContentStatus.REMOVED;
    }

    private String explanation(
        String automationRule,
        ActionSpec action,
        String policyName,
        List<String> matches,
        String decision
    ) {
        if (matches.isEmpty()) {
            return "No generated keyword condition matched; " + policyName + " approved content.";
        }
        String actionName = action == null ? "NoAction" : action.getName();
        String actionKind = action == null ? "NONE" : action.getKind().name();
        String actionMessage = action == null ? "" : "; message: " + action.getMessage();
        return automationRule
            + " matched " + matches
            + "; " + actionName
            + " uses " + actionKind
            + "; " + policyName
            + " records decision " + decision
            + actionMessage
            + ".";
    }

    private AutomationRuleSpec primaryRule(PolicySpec policy) {
        if (policy == null || policy.getAutomationRules().isEmpty()) {
            return null;
        }
        return policy.getAutomationRules().get(0);
    }

    private List<ConditionSpec> ruleConditions(AutomationRuleSpec rule) {
        return rule == null ? List.of() : rule.getConditions();
    }

    private ActionSpec primaryAction(AutomationRuleSpec rule) {
        return rule == null || rule.getActions().isEmpty() ? null : rule.getActions().get(0);
    }

    private String ruleName(AutomationRuleSpec rule) {
        return rule == null ? "NoAutomationRule" : rule.getName();
    }

    private String actionName(ActionSpec action) {
        return action == null ? "NoAction" : action.getName();
    }

    private String actionKind(ActionSpec action) {
        return action == null ? "NONE" : action.getKind().name();
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
        boolean allowed = moderator.getRole() != null && GeneratedModerationModel.POLICIES.stream()
            .anyMatch(policy -> policy.getExecutedByKind() != null
                && policy.getExecutedByKind().name().equalsIgnoreCase(moderator.getRole().name()));
        if (!allowed) {
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
