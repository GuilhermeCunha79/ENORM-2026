package pt.isep.enorm.ref.amazon.service.generated;

import java.util.List;

import pt.isep.enorm.ref.amazon.domain.enums.ActionResultKind;
import pt.isep.enorm.ref.amazon.domain.enums.ConditionOperator;
import pt.isep.enorm.ref.amazon.domain.enums.ModerationDecision;
import pt.isep.enorm.ref.amazon.domain.enums.ModerationMode;
import pt.isep.enorm.ref.amazon.domain.enums.Role;
import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;

public final class GeneratedModerationModel {

    public static final String POLICY_NAME = "ReviewModerationOnCreate";
    public static final ModerationMode POLICY_MODE = ModerationMode.HYBRID;
    public static final TriggerEvent POLICY_TRIGGER = TriggerEvent.ON_FEEDBACK_CREATE;
    public static final ModerationDecision POLICY_DECISION = ModerationDecision.FLAGGED;
    public static final String POLICY_MONITORS_RESOURCE = "Product";
    public static final String POLICY_MONITORS_FEEDBACK = "ProductReview";
    public static final Role POLICY_EXECUTED_BY = Role.MODERATOR;
    public static final String POLICY_CONTEXT = "ModerationBackoffice";

    public static final String AUTOMATION_RULE_NAME = "AutoReviewContentCheck";
    public static final TriggerEvent AUTOMATION_TRIGGER = TriggerEvent.ON_FEEDBACK_CREATE;
    public static final List<ConditionSpec> CONDITIONS = List.of(
        new ConditionSpec(
            "ReviewTextKeywordScreening",
            ConditionOperator.CONTAINS_KEYWORDS,
            "text",
            List.of("spam", "abuse", "off-topic", "incentivized")
        )
    );
    public static final List<ActionSpec> ACTIONS = List.of(
        new ActionSpec(
            "FlagSuspiciousReview",
            ActionResultKind.FLAG_CONTENT,
            "set review.status='UNDER_REVIEW'; create ReviewModerationCheck(reason='keyword-match', result='FLAGGED')"
        )
    );

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
