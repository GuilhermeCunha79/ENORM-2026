package pt.isep.enorm.ref.amazon.service.generated;

import java.util.List;

import pt.isep.enorm.ref.amazon.domain.enums.ActionResultKind;
import pt.isep.enorm.ref.amazon.domain.enums.ConditionOperator;
import pt.isep.enorm.ref.amazon.domain.enums.ModerationDecision;
import pt.isep.enorm.ref.amazon.domain.enums.ModerationMode;
import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;
import pt.isep.enorm.ref.amazon.domain.enums.UserKind;

public final class GeneratedModerationModel {

    public static final List<PolicySpec> POLICIES = List.of(
        new PolicySpec(
            "ReviewModerationOnCreate",
            "Product",
            "ProductReview",
            ModerationMode.HYBRID,
            TriggerEvent.ON_FEEDBACK_CREATE,
            ModerationDecision.FLAGGED,
            UserKind.MODERATOR,
            "ModerationBackoffice",
            List.of(
                new AutomationRuleSpec(
                    "AutoReviewContentCheck",
                    TriggerEvent.ON_FEEDBACK_CREATE,
                    List.of(
                        new ConditionSpec(
                            "ReviewTextKeywordScreening",
                            ConditionOperator.CONTAINS_KEYWORDS,
                            "text",
                            List.of("spam", "abuse", "off-topic", "incentivized")
                        )
                    ),
                    List.of(
                        new ActionSpec(
                            "FlagSuspiciousReview",
                            ActionResultKind.FLAG_CONTENT,
                            "set review.status='UNDER_REVIEW'; create ReviewModerationCheck(reason='keyword-match', result='FLAGGED')"
                        )
                    )
                )
            )
        ),
        new PolicySpec(
            "PendingReviewModeration",
            "Product",
            "ProductReview",
            ModerationMode.MANUAL,
            TriggerEvent.ON_REPORT_THRESHOLD,
            ModerationDecision.FLAGGED,
            UserKind.MODERATOR,
            "ModerationBackoffice",
            List.of(
                new AutomationRuleSpec(
                    "EscalatePendingReviewKeywords",
                    TriggerEvent.ON_REPORT_THRESHOLD,
                    List.of(
                        new ConditionSpec(
                            "PendingReviewKeywordScreening",
                            ConditionOperator.CONTAINS_KEYWORDS,
                            "text",
                            List.of("spam", "abuse", "off-topic", "incentivized")
                        )
                    ),
                    List.of(
                        new ActionSpec(
                            "NotifyModeratorAboutPendingReview",
                            ActionResultKind.NOTIFY_MODERATOR,
                            "notify moderator about pending review keyword match"
                        )
                    )
                )
            )
        )
    );

    public static final PolicySpec DEFAULT_POLICY = POLICIES.get(0);
    public static final AutomationRuleSpec DEFAULT_AUTOMATION_RULE = DEFAULT_POLICY.getAutomationRules().get(0);

    public static final String POLICY_NAME = DEFAULT_POLICY.getName();
    public static final ModerationMode POLICY_MODE = DEFAULT_POLICY.getMode();
    public static final TriggerEvent POLICY_TRIGGER = DEFAULT_POLICY.getTrigger();
    public static final ModerationDecision POLICY_DECISION = DEFAULT_POLICY.getDecision();
    public static final String POLICY_MONITORS_RESOURCE = DEFAULT_POLICY.getResourceTarget();
    public static final String POLICY_MONITORS_FEEDBACK = DEFAULT_POLICY.getFeedbackTarget();
    public static final UserKind POLICY_EXECUTED_BY_KIND = DEFAULT_POLICY.getExecutedByKind();
    public static final String POLICY_CONTEXT = DEFAULT_POLICY.getContext();

    public static final String AUTOMATION_RULE_NAME = DEFAULT_AUTOMATION_RULE.getName();
    public static final TriggerEvent AUTOMATION_TRIGGER = DEFAULT_AUTOMATION_RULE.getTrigger();
    public static final List<ConditionSpec> CONDITIONS = DEFAULT_AUTOMATION_RULE.getConditions();
    public static final List<ActionSpec> ACTIONS = DEFAULT_AUTOMATION_RULE.getActions();

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

        public PolicySpec(
            String name,
            String resourceTarget,
            String feedbackTarget,
            ModerationMode mode,
            TriggerEvent trigger,
            ModerationDecision decision,
            UserKind executedByKind,
            String context,
            List<AutomationRuleSpec> automationRules
        ) {
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

        public String getName() {
            return name;
        }

        public String getResourceTarget() {
            return resourceTarget;
        }

        public String getFeedbackTarget() {
            return feedbackTarget;
        }

        public ModerationMode getMode() {
            return mode;
        }

        public TriggerEvent getTrigger() {
            return trigger;
        }

        public ModerationDecision getDecision() {
            return decision;
        }

        public UserKind getExecutedByKind() {
            return executedByKind;
        }

        public String getContext() {
            return context;
        }

        public List<AutomationRuleSpec> getAutomationRules() {
            return automationRules;
        }
    }

    public static final class AutomationRuleSpec {
        private final String name;
        private final TriggerEvent trigger;
        private final List<ConditionSpec> conditions;
        private final List<ActionSpec> actions;

        public AutomationRuleSpec(
            String name,
            TriggerEvent trigger,
            List<ConditionSpec> conditions,
            List<ActionSpec> actions
        ) {
            this.name = name;
            this.trigger = trigger;
            this.conditions = conditions;
            this.actions = actions;
        }

        public String getName() {
            return name;
        }

        public TriggerEvent getTrigger() {
            return trigger;
        }

        public List<ConditionSpec> getConditions() {
            return conditions;
        }

        public List<ActionSpec> getActions() {
            return actions;
        }
    }

    public static final class ConditionSpec {
        private final String name;
        private final ConditionOperator operator;
        private final String attribute;
        private final List<String> values;

        public ConditionSpec(String name, ConditionOperator operator, String attribute, List<String> values) {
            this.name = name;
            this.operator = operator;
            this.attribute = attribute;
            this.values = values;
        }

        public String getName() {
            return name;
        }

        public ConditionOperator getOperator() {
            return operator;
        }

        public String getAttribute() {
            return attribute;
        }

        public List<String> getValues() {
            return values;
        }
    }

    public static final class ActionSpec {
        private final String name;
        private final ActionResultKind kind;
        private final String message;

        public ActionSpec(String name, ActionResultKind kind, String message) {
            this.name = name;
            this.kind = kind;
            this.message = message;
        }

        public String getName() {
            return name;
        }

        public ActionResultKind getKind() {
            return kind;
        }

        public String getMessage() {
            return message;
        }
    }

    private GeneratedModerationModel() {
    }
}
