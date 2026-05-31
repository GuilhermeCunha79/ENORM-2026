package pt.isep.enorm.ref.service.generated;

import java.util.List;

import pt.isep.enorm.ref.domain.enums.CommentModerationResult;
import pt.isep.enorm.ref.domain.enums.CommentModerationType;
import pt.isep.enorm.ref.domain.enums.UserKind;
import pt.isep.enorm.ref.domain.enums.VideoModerationResult;
import pt.isep.enorm.ref.domain.enums.VideoModerationType;

public final class GeneratedModerationModel {
    public enum ModerationMode { AUTOMATIC, MANUAL, HYBRID }
    public enum TriggerEvent { ON_RESOURCE_CREATE, ON_FEEDBACK_CREATE, ON_REPORT_THRESHOLD }
    public enum ModerationDecision { APPROVED, FLAGGED, HIDDEN, REMOVED, BLOCKED, REJECTED }
    public enum ConditionOperator { CONTAINS_KEYWORDS, HAS_PROPERTY, HAS_SPECIFIC_PROPERTY }
    public enum ActionKind { FLAG_CONTENT, HIDE_CONTENT, NOTIFY_MODERATOR }

    public static final List<PolicySpec> POLICIES = List.of(
        new PolicySpec("VideoCreationModeration", "Video", null, ModerationMode.HYBRID, TriggerEvent.ON_RESOURCE_CREATE, ModerationDecision.FLAGGED, UserKind.MODERATOR, null,
            List.of(new AutomationRuleSpec("AutoVideoCopyrightCheck", TriggerEvent.ON_RESOURCE_CREATE,
                List.of(new ConditionSpec("VideoContainsCopyrightRiskKeywords", ConditionOperator.CONTAINS_KEYWORDS, "video_title_and_description", List.of("copyright", "reupload", "unlicensed"))),
                List.of(new ActionSpec("FlagVideo", ActionKind.FLAG_CONTENT, "Video flagged for moderator review"))))),
        new PolicySpec("CommentCreationModeration", "Video", "CommentOnVideo", ModerationMode.HYBRID, TriggerEvent.ON_FEEDBACK_CREATE, ModerationDecision.FLAGGED, UserKind.MODERATOR, null,
            List.of(new AutomationRuleSpec("AutoCommentModerationCheck", TriggerEvent.ON_FEEDBACK_CREATE,
                List.of(new ConditionSpec("CommentContainsRiskyTerms", ConditionOperator.CONTAINS_KEYWORDS, "comment_text", List.of("spam", "toxicity", "blocked-word"))),
                List.of(new ActionSpec("FlagComment", ActionKind.FLAG_CONTENT, "Comment flagged for moderator review"))))),
        new PolicySpec("ReportedContentModeration", "Content", "ReportContent", ModerationMode.MANUAL, TriggerEvent.ON_REPORT_THRESHOLD, ModerationDecision.HIDDEN, UserKind.MODERATOR, null,
            List.of(new AutomationRuleSpec("AutoReportEscalation", TriggerEvent.ON_REPORT_THRESHOLD,
                List.of(new ConditionSpec("ReportThresholdReached", ConditionOperator.HAS_SPECIFIC_PROPERTY, "report_status", List.of("PENDING"))),
                List.of(new ActionSpec("HideReportedContent", ActionKind.HIDE_CONTENT, "Hide reported content and notify moderator")))))
    );

    public static final PolicySpec VIDEO_POLICY = POLICIES.get(0);
    public static final PolicySpec COMMENT_POLICY = POLICIES.get(1);
    public static final PolicySpec REPORT_POLICY = POLICIES.get(2);
    public static final PolicySpec DEFAULT_POLICY = VIDEO_POLICY;
    public static final VideoModerationType VIDEO_CHECK_TYPE = VideoModerationType.COPYRIGHT;
    public static final VideoModerationResult VIDEO_DECISION_ON_MATCH = VideoModerationResult.FLAGGED;
    public static final CommentModerationType COMMENT_CHECK_TYPE = CommentModerationType.BLOCKED_WORD;
    public static final CommentModerationResult COMMENT_DECISION_ON_MATCH = CommentModerationResult.FLAGGED;

    public static final class PolicySpec {
        private final String name;
        private final String resourceTarget;
        private final String feedbackTarget;
        private final ModerationMode mode;
        private final TriggerEvent trigger;
        private final ModerationDecision decision;
        private final UserKind executedByKind;
        private final String context;
        private final List<AutomationRuleSpec> automationRules;
        public PolicySpec(String name, String resourceTarget, String feedbackTarget, ModerationMode mode, TriggerEvent trigger, ModerationDecision decision, UserKind executedByKind, String context, List<AutomationRuleSpec> automationRules) { this.name = name; this.resourceTarget = resourceTarget; this.feedbackTarget = feedbackTarget; this.mode = mode; this.trigger = trigger; this.decision = decision; this.executedByKind = executedByKind; this.context = context; this.automationRules = automationRules; }
        public String getName() { return name; }
        public String getResourceTarget() { return resourceTarget; }
        public String getFeedbackTarget() { return feedbackTarget; }
        public ModerationMode getMode() { return mode; }
        public TriggerEvent getTrigger() { return trigger; }
        public ModerationDecision getDecision() { return decision; }
        public UserKind getExecutedByKind() { return executedByKind; }
        public String getContext() { return context; }
        public List<AutomationRuleSpec> getAutomationRules() { return automationRules; }
    }

    public static final class AutomationRuleSpec {
        private final String name;
        private final TriggerEvent trigger;
        private final List<ConditionSpec> conditions;
        private final List<ActionSpec> actions;
        public AutomationRuleSpec(String name, TriggerEvent trigger, List<ConditionSpec> conditions, List<ActionSpec> actions) { this.name = name; this.trigger = trigger; this.conditions = conditions; this.actions = actions; }
        public String getName() { return name; }
        public TriggerEvent getTrigger() { return trigger; }
        public List<ConditionSpec> getConditions() { return conditions; }
        public List<ActionSpec> getActions() { return actions; }
    }

    public static final class ConditionSpec {
        private final String name;
        private final ConditionOperator operator;
        private final String attribute;
        private final List<String> values;
        public ConditionSpec(String name, ConditionOperator operator, String attribute, List<String> values) { this.name = name; this.operator = operator; this.attribute = attribute; this.values = values; }
        public String getName() { return name; }
        public ConditionOperator getOperator() { return operator; }
        public String getAttribute() { return attribute; }
        public List<String> getValues() { return values; }
    }

    public static final class ActionSpec {
        private final String name;
        private final ActionKind kind;
        private final String message;
        public ActionSpec(String name, ActionKind kind, String message) { this.name = name; this.kind = kind; this.message = message; }
        public String getName() { return name; }
        public ActionKind getKind() { return kind; }
        public String getMessage() { return message; }
    }

    private GeneratedModerationModel() {
    }
}
