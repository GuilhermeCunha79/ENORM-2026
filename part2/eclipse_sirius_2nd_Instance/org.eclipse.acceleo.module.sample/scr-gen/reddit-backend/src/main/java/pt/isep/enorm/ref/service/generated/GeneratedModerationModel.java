package pt.isep.enorm.ref.service.generated;

import java.util.List;

import pt.isep.enorm.ref.domain.enums.UserKind;

public final class GeneratedModerationModel {
    public enum ModerationMode { AUTOMATIC, MANUAL, HYBRID }
    public enum TriggerEvent { ON_RESOURCE_CREATE, ON_FEEDBACK_CREATE, ON_REPORT_THRESHOLD }
    public enum ModerationDecision { APPROVED, FLAGGED, HIDDEN, REMOVED, BLOCKED, REJECTED }
    public enum ConditionOperator { CONTAINS_KEYWORDS }
    public enum ActionResultKind { FLAG_CONTENT }

    public static final List<PolicySpec> POLICIES = List.of(
        new PolicySpec("PostModeration", "Post", "PostThreadComment", ModerationMode.HYBRID, TriggerEvent.ON_REPORT_THRESHOLD, ModerationDecision.FLAGGED, UserKind.MODERATOR, null,
            List.of(new AutomationRuleSpec("RedditAutoValidate", TriggerEvent.ON_REPORT_THRESHOLD,
                List.of(new ConditionSpec("BlockedPostKeywords", ConditionOperator.CONTAINS_KEYWORDS, "content", List.of("spam", "malware", "phishing"))),
                List.of(new ActionSpec("FlagPost", ActionResultKind.FLAG_CONTENT, "Post flagged for moderator review"))))),
        new PolicySpec("CommentModeration", "Comment", "PostThreadComment", ModerationMode.HYBRID, TriggerEvent.ON_REPORT_THRESHOLD, ModerationDecision.FLAGGED, UserKind.MODERATOR, null,
            List.of(new AutomationRuleSpec("RedditCommentAutoValidate", TriggerEvent.ON_REPORT_THRESHOLD,
                List.of(new ConditionSpec("BlockedCommentKeywords", ConditionOperator.CONTAINS_KEYWORDS, "text", List.of("spam", "malware", "phishing"))),
                List.of(new ActionSpec("FlagComment", ActionResultKind.FLAG_CONTENT, "Comment flagged for moderator review")))))
    );

    public static final PolicySpec DEFAULT_POLICY = POLICIES.get(0);
    public static final AutomationRuleSpec DEFAULT_AUTOMATION_RULE = DEFAULT_POLICY.getAutomationRules().get(0);
    public static final String POST_CHECK_TYPE = "CONTENT";
    public static final String COMMENT_CHECK_TYPE = "BLOCKED_WORD";

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

        public PolicySpec(String name, String resourceTarget, String feedbackTarget, ModerationMode mode, TriggerEvent trigger, ModerationDecision decision, UserKind executedByKind, String context, List<AutomationRuleSpec> automationRules) {
            this.name = name;
            this.resourceTarget = resourceTarget;
            this.feedbackTarget = feedbackTarget;
            this.mode = mode;
            this.trigger = trigger;
            this.decision = decision;
            this.executedByKind = executedByKind;
            this.context = context;
            this.automationRules = automationRules;
        }

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
        private final ActionResultKind kind;
        private final String message;
        public ActionSpec(String name, ActionResultKind kind, String message) { this.name = name; this.kind = kind; this.message = message; }
        public String getName() { return name; }
        public ActionResultKind getKind() { return kind; }
        public String getMessage() { return message; }
    }

    private GeneratedModerationModel() {
    }
}
