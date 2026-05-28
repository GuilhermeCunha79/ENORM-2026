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
    public static final List<ConditionSpec> CONDITIONS = List.of(
        new ConditionSpec(
            "BlockedKeywords",
            ConditionOperator.CONTAINS_KEYWORDS,
            "content",
            List.of("spam", "malware", "phishing")
        )
    );
    public static final List<ActionSpec> ACTIONS = List.of(
        new ActionSpec(
            "FlagPost",
            ActionKind.FLAG_CONTENT,
            "Post flagged for moderator review"
        )
    );

    public static final PostModerationType POST_CHECK_TYPE = PostModerationType.CONTENT;
    public static final CommentModerationType COMMENT_CHECK_TYPE = CommentModerationType.BLOCKED_WORD;

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
        private final ActionKind kind;
        private final String message;

        public ActionSpec(String name, ActionKind kind, String message) {
            this.name = name;
            this.kind = kind;
            this.message = message;
        }

        public String getName() {
            return name;
        }

        public ActionKind getKind() {
            return kind;
        }

        public String getMessage() {
            return message;
        }
    }

    private GeneratedModerationModel() {
    }
}
