package pt.isep.enorm.ref.reddit.service.generated;

import java.util.List;

import pt.isep.enorm.ref.reddit.domain.enums.CommentModerationType;
import pt.isep.enorm.ref.reddit.domain.enums.PostModerationType;

public final class GeneratedModerationModel {

    public enum ModerationMode {
        AUTOMATIC,
        MANUAL,
        HYBRID
    }

    public enum TriggerEvent {
        ON_FEEDBACK_CREATE,
        ON_REPORT_THRESHOLD
    }

    public enum ModerationDecision {
        APPROVED,
        FLAGGED,
        HIDDEN,
        REMOVED,
        BLOCKED,
        REJECTED
    }

    public enum ConditionOperator {
        CONTAINS_KEYWORDS
    }

    public enum ActionKind {
        FLAG_CONTENT
    }

    public static final String POLICY_NAME = "PostModeration";
    public static final ModerationMode POLICY_MODE = ModerationMode.HYBRID;
    public static final TriggerEvent POLICY_TRIGGER = TriggerEvent.ON_REPORT_THRESHOLD;
    public static final ModerationDecision POLICY_DECISION = ModerationDecision.FLAGGED;
    public static final String POLICY_MONITORS_RESOURCE = "Post";
    public static final String POLICY_MONITORS_FEEDBACK = "PostThreadComment";
    public static final String POLICY_EXECUTED_BY = "Moderator";

    public static final String AUTOMATION_RULE_NAME = "RedditAutoValidate";
    public static final TriggerEvent AUTOMATION_TRIGGER = TriggerEvent.ON_FEEDBACK_CREATE;
    public static final String CONDITION_NAME = "BlockedKeywords";
    public static final ConditionOperator CONDITION_OPERATOR = ConditionOperator.CONTAINS_KEYWORDS;
    public static final String CONDITION_ATTRIBUTE = "content";
    public static final List<String> BLOCKED_KEYWORDS = List.of("spam", "malware", "phishing");
    public static final String ACTION_NAME = "FlagPost";
    public static final ActionKind ACTION_KIND = ActionKind.FLAG_CONTENT;
    public static final String ACTION_MESSAGE = "Post flagged for moderator review";

    public static final PostModerationType POST_CHECK_TYPE = PostModerationType.CONTENT;
    public static final CommentModerationType COMMENT_CHECK_TYPE = CommentModerationType.BLOCKED_WORD;

    private GeneratedModerationModel() {
    }
}
