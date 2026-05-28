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
    public static final String CONDITION_NAME = "ReviewTextKeywordScreening";
    public static final ConditionOperator CONDITION_OPERATOR = ConditionOperator.CONTAINS_KEYWORDS;
    public static final String CONDITION_ATTRIBUTE = "text";
    public static final List<String> BLOCKED_KEYWORDS = List.of("spam", "abuse", "off-topic", "incentivized");
    public static final String ACTION_NAME = "FlagSuspiciousReview";
    public static final ActionResultKind ACTION_KIND = ActionResultKind.FLAG_CONTENT;
    public static final String ACTION_MESSAGE = "set review.status='UNDER_REVIEW'; create ReviewModerationCheck(reason='keyword-match', result='FLAGGED')";

    private GeneratedModerationModel() {
    }
}
