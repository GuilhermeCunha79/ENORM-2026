package pt.isep.enorm.ref.reddit.service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.reddit.domain.Comment;
import pt.isep.enorm.ref.reddit.domain.CommentModerationCheck;
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.PostModerationCheck;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.Report;
import pt.isep.enorm.ref.reddit.domain.enums.CommentModerationResult;
import pt.isep.enorm.ref.reddit.domain.enums.ContentStatus;
import pt.isep.enorm.ref.reddit.domain.enums.PostModerationResult;
import pt.isep.enorm.ref.reddit.domain.enums.ReportStatus;
import pt.isep.enorm.ref.reddit.repository.CommentModerationCheckRepository;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.CommunityRuleRepository;
import pt.isep.enorm.ref.reddit.repository.PostModerationCheckRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.repository.ReportRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedModerationModel;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedModerationModel.ActionSpec;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedModerationModel.AutomationRuleSpec;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedModerationModel.ConditionSpec;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedModerationModel.ModerationDecision;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedModerationModel.ModerationMode;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedModerationModel.PolicySpec;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedModerationModel.TriggerEvent;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedModerationService;
import pt.isep.enorm.ref.reddit.service.projection.ModerationSimulationResult;
import pt.isep.enorm.ref.reddit.web.error.ResourceNotFoundException;

@Service
public class ModerationService extends GeneratedModerationService {

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

    @Transactional
    public ModerationSimulationResult simulatePostModeration(RedditUser moderator, Long postId) {
        ensureModerator(moderator);
        Post post = loadPost(postId);
        Optional<Report> report = findPendingPostReport(postId);
        TriggerEvent trigger = report.isPresent() ? TriggerEvent.ON_REPORT_THRESHOLD : TriggerEvent.ON_RESOURCE_CREATE;
        PolicySpec policy = policyFor("POST", trigger);

        if (!isPolicyTriggerMatched(policy, report.isPresent())) {
            return skipped("POST", post.getId(), post.getStatus(), report.orElse(null), policy);
        }

        return moderatePost(moderator, post, report.orElse(null), policy);
    }

    @Transactional
    public ModerationSimulationResult simulateCommentModeration(RedditUser moderator, Long commentId) {
        ensureModerator(moderator);
        Comment comment = loadComment(commentId);
        Optional<Report> report = findPendingCommentReport(commentId);
        TriggerEvent trigger = report.isPresent() ? TriggerEvent.ON_REPORT_THRESHOLD : TriggerEvent.ON_FEEDBACK_CREATE;
        PolicySpec policy = policyFor("COMMENT", trigger);

        if (!isPolicyTriggerMatched(policy, report.isPresent())) {
            return skipped("COMMENT", comment.getId(), comment.getStatus(), report.orElse(null), policy);
        }

        return moderateComment(moderator, comment, report.orElse(null), policy);
    }

    @Transactional
    public List<ModerationSimulationResult> simulateReportModeration(RedditUser moderator) {
        ensureModerator(moderator);
        List<ModerationSimulationResult> results = new ArrayList<>();

        for (Report report : reportRepository.findByStatus(ReportStatus.PENDING)) {
            if (report.getPost() != null) {
                results.add(moderatePost(moderator, report.getPost(), report, policyFor("POST", TriggerEvent.ON_REPORT_THRESHOLD)));
            } else if (report.getComment() != null) {
                results.add(moderateComment(moderator, report.getComment(), report, policyFor("COMMENT", TriggerEvent.ON_REPORT_THRESHOLD)));
            }
        }

        return results;
    }

    @Transactional
    public void moderateAutomaticallyOnPostCreated(Post post) {
        if (post == null) {
            return;
        }

        PolicySpec policy = policyFor("POST", TriggerEvent.ON_RESOURCE_CREATE);
        if (!isAutomatic(policy) || !isPolicyTriggerMatched(policy, false)) {
            return;
        }

        moderatePost(null, post, null, policy);
    }

    @Transactional
    public void moderateAutomaticallyOnCommentCreated(Comment comment) {
        if (comment == null) {
            return;
        }

        PolicySpec policy = policyFor("COMMENT", TriggerEvent.ON_FEEDBACK_CREATE);
        if (!isAutomatic(policy) || !isPolicyTriggerMatched(policy, false)) {
            return;
        }

        moderateComment(null, comment, null, policy);
    }

    @Transactional
    public void moderateAutomaticallyOnReportCreated(Report report) {
        if (report == null) {
            return;
        }

        if (report.getPost() != null) {
            PolicySpec policy = policyFor("POST", TriggerEvent.ON_REPORT_THRESHOLD);
            if (isAutomatic(policy) && isPolicyTriggerMatched(policy, true)) {
                moderatePost(null, report.getPost(), report, policy);
            }
            return;
        }

        if (report.getComment() != null) {
            PolicySpec policy = policyFor("COMMENT", TriggerEvent.ON_REPORT_THRESHOLD);
            if (isAutomatic(policy) && isPolicyTriggerMatched(policy, true)) {
                moderateComment(null, report.getComment(), report, policy);
            }
        }
    }

    private ModerationSimulationResult moderatePost(RedditUser moderator, Post post, Report report, PolicySpec policy) {
        AutomationRuleSpec rule = primaryRule(policy);
        List<String> matches = findMatchedKeywords(post.getTitle() + " " + post.getDescription(), rule);
        PostModerationResult decision = matches.isEmpty()
            ? PostModerationResult.APPROVED
            : postResultFor(policy.getDecision());
        ContentStatus status = matches.isEmpty()
            ? ContentStatus.ACTIVE
            : statusFor(policy.getDecision(), policy, rule);

        post.setStatus(status);
        postRepository.save(post);

        PostModerationCheck check = savePostCheck(moderator, post, decision);
        closeReport(report, moderator, status);

        return result(
            "POST",
            post.getId(),
            check.getId(),
            report,
            decision.name(),
            status,
            matches,
            explanation(matches, GeneratedModerationModel.POST_CHECK_TYPE.name(), decision.name(), policy, rule),
            policy
        );
    }

    private ModerationSimulationResult moderateComment(RedditUser moderator, Comment comment, Report report, PolicySpec policy) {
        AutomationRuleSpec rule = primaryRule(policy);
        List<String> matches = findMatchedKeywords(comment.getText(), rule);
        CommentModerationResult decision = matches.isEmpty()
            ? CommentModerationResult.APPROVED
            : commentResultFor(policy.getDecision());
        ContentStatus status = matches.isEmpty()
            ? ContentStatus.ACTIVE
            : statusFor(policy.getDecision(), policy, rule);

        comment.setStatus(status);
        commentRepository.save(comment);

        CommentModerationCheck check = saveCommentCheck(moderator, comment, decision);
        closeReport(report, moderator, status);

        return result(
            "COMMENT",
            comment.getId(),
            check.getId(),
            report,
            decision.name(),
            status,
            matches,
            explanation(matches, GeneratedModerationModel.COMMENT_CHECK_TYPE.name(), decision.name(), policy, rule),
            policy
        );
    }

    private boolean isPolicyTriggerMatched(PolicySpec policy, boolean hasPendingReport) {
        if (policy == null) {
            return false;
        }
        if (policy.getTrigger() == TriggerEvent.ON_REPORT_THRESHOLD) {
            return hasPendingReport;
        }
        return true;
    }

    private List<String> findMatchedKeywords(String content, AutomationRuleSpec rule) {
        String normalized = normalize(content);
        List<String> matches = new ArrayList<>();

        if (rule == null) {
            return matches;
        }

        for (ConditionSpec condition : rule.getConditions()) {
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

    private ContentStatus statusFor(ModerationDecision decision, PolicySpec policy, AutomationRuleSpec rule) {
        if (decision == ModerationDecision.APPROVED) {
            return ContentStatus.ACTIVE;
        }

        ActionSpec action = primaryAction(rule);
        if (action != null && action.getKind() == GeneratedModerationModel.ActionKind.FLAG_CONTENT) {
            return ContentStatus.FLAGGED;
        }

        if (policy.getMode() == ModerationMode.MANUAL) {
            return ContentStatus.UNDER_REVIEW;
        }

        if (decision == ModerationDecision.FLAGGED) {
            return ContentStatus.FLAGGED;
        }

        return ContentStatus.REMOVED;
    }

    private PostModerationResult postResultFor(ModerationDecision decision) {
        return switch (decision) {
            case APPROVED -> PostModerationResult.APPROVED;
            case FLAGGED -> PostModerationResult.FLAGGED;
            default -> PostModerationResult.BLOCKED;
        };
    }

    private CommentModerationResult commentResultFor(ModerationDecision decision) {
        return switch (decision) {
            case APPROVED -> CommentModerationResult.APPROVED;
            case FLAGGED -> CommentModerationResult.FLAGGED;
            default -> CommentModerationResult.HIDDEN;
        };
    }

    private String explanation(
        List<String> matches,
        String checkType,
        String decision,
        PolicySpec policy,
        AutomationRuleSpec rule
    ) {
        if (matches.isEmpty()) {
            return "No " + conditionNames(rule)
                + " match; content approved by " + policy.getName() + ".";
        }

        ActionSpec action = primaryAction(rule);
        String actionName = action == null ? "NoAction" : action.getName();
        String actionKind = action == null ? "NONE" : action.getKind().name();
        String actionMessage = action == null ? "" : "; message: " + action.getMessage();

        return ruleName(rule)
            + " (" + ruleTrigger(rule) + ") matched " + matches
            + "; " + actionName
            + " uses " + actionKind
            + "; " + policy.getName()
            + " records " + checkType
            + " as " + decision
            + actionMessage
            + ".";
    }

    private PolicySpec policyFor(String targetType, TriggerEvent trigger) {
        String resourceTarget = "POST".equals(targetType) ? "Post" : "Comment";
        return GeneratedModerationModel.POLICIES.stream()
            .filter(policy -> policy.getTrigger() == trigger)
            .filter(policy -> resourceTarget.equals(policy.getResourceTarget()))
            .findFirst()
            .orElse(null);
    }

    private boolean isAutomatic(PolicySpec policy) {
        return policy != null && policy.getMode() == ModerationMode.AUTOMATIC;
    }

    private AutomationRuleSpec primaryRule(PolicySpec policy) {
        if (policy == null || policy.getAutomationRules().isEmpty()) {
            return null;
        }
        return policy.getAutomationRules().get(0);
    }

    private ActionSpec primaryAction(AutomationRuleSpec rule) {
        return rule == null || rule.getActions().isEmpty() ? null : rule.getActions().get(0);
    }

    private String conditionNames(AutomationRuleSpec rule) {
        if (rule == null) {
            return "[]";
        }
        return rule.getConditions().stream()
            .map(ConditionSpec::getName)
            .toList()
            .toString();
    }

    private String ruleName(AutomationRuleSpec rule) {
        return rule == null ? "NoAutomationRule" : rule.getName();
    }

    private String ruleTrigger(AutomationRuleSpec rule) {
        return rule == null ? "NONE" : rule.getTrigger().name();
    }

    private ModerationSimulationResult skipped(
        String targetType,
        Long targetId,
        ContentStatus status,
        Report report,
        PolicySpec policy
    ) {
        return result(
            targetType,
            targetId,
            null,
            report,
            "SKIPPED",
            status,
            List.of(),
            (policy == null ? "No generated policy" : policy.getName()) + " skipped because "
                + (policy == null ? "NONE" : policy.getTrigger()) + " did not match.",
            policy
        );
    }

    private ModerationSimulationResult result(
        String targetType,
        Long targetId,
        Long checkId,
        Report report,
        String decision,
        ContentStatus status,
        List<String> matches,
        String explanation,
        PolicySpec policy
    ) {
        PolicySpec resultPolicy = policy == null ? GeneratedModerationModel.DEFAULT_POLICY : policy;
        return new ModerationSimulationResult(
            targetType,
            targetId,
            checkId,
            report == null ? null : report.getId(),
            resultPolicy.getTrigger().name(),
            resultPolicy.getMode().name(),
            decision,
            status.name(),
            matches,
            explanation
        );
    }

    private void closeReport(Report report, RedditUser moderator, ContentStatus status) {
        if (report == null) {
            return;
        }

        report.setReviewedBy(moderator);
        report.setStatus(status == ContentStatus.REMOVED ? ReportStatus.REMOVED : ReportStatus.REVIEWED);
        reportRepository.save(report);
    }

    private Optional<Report> findPendingPostReport(Long postId) {
        return reportRepository.findFirstByPostIdAndStatusOrderByTimestampDesc(postId, ReportStatus.PENDING);
    }

    private Optional<Report> findPendingCommentReport(Long commentId) {
        return reportRepository.findFirstByCommentIdAndStatusOrderByTimestampDesc(commentId, ReportStatus.PENDING);
    }

    private PostModerationCheck savePostCheck(
        RedditUser moderator,
        Post post,
        PostModerationResult result
    ) {
        PostModerationCheck check = new PostModerationCheck();
        check.setType(GeneratedModerationModel.POST_CHECK_TYPE);
        check.setResult(result);
        check.setTimestamp(Instant.now());
        check.setPost(post);
        check.setReviewedBy(moderator);
        return postModerationCheckRepository.save(check);
    }

    private CommentModerationCheck saveCommentCheck(
        RedditUser moderator,
        Comment comment,
        CommentModerationResult result
    ) {
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

    private void ensureModerator(RedditUser moderator) {
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

    private Post loadPost(Long postId) {
        return postRepository.findById(postId)
            .orElseThrow(() -> new ResourceNotFoundException("Post '%s' was not found.".formatted(postId)));
    }

    private Comment loadComment(Long commentId) {
        return commentRepository.findById(commentId)
            .orElseThrow(() -> new ResourceNotFoundException("Comment '%s' was not found.".formatted(commentId)));
    }
}
