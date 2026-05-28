package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;

import pt.isep.enorm.ref.youtube.domain.enums.CommentModerationResult;
import pt.isep.enorm.ref.youtube.domain.enums.CommentModerationType;
import pt.isep.enorm.ref.youtube.domain.enums.VideoModerationResult;
import pt.isep.enorm.ref.youtube.domain.enums.VideoModerationType;

public final class GeneratedModerationModel {

    public enum ModerationMode {
        AUTOMATIC,
        MANUAL,
        HYBRID
    }

    public enum TriggerEvent {
        ON_RESOURCE_CREATE,
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
        FLAG_CONTENT,
        HIDE_CONTENT
    }

    public static final String VIDEO_POLICY_NAME = "VideoCreationModeration";
    public static final ModerationMode VIDEO_POLICY_MODE = ModerationMode.HYBRID;
    public static final TriggerEvent VIDEO_POLICY_TRIGGER = TriggerEvent.ON_RESOURCE_CREATE;
    public static final ModerationDecision VIDEO_POLICY_DECISION = ModerationDecision.FLAGGED;
    public static final String VIDEO_POLICY_MONITORS_RESOURCE = "Video";
    public static final String VIDEO_POLICY_MONITORS_FEEDBACK = null;

    public static final String COMMENT_POLICY_NAME = "CommentCreationModeration";
    public static final ModerationMode COMMENT_POLICY_MODE = ModerationMode.HYBRID;
    public static final TriggerEvent COMMENT_POLICY_TRIGGER = TriggerEvent.ON_FEEDBACK_CREATE;
    public static final ModerationDecision COMMENT_POLICY_DECISION = ModerationDecision.FLAGGED;
    public static final String COMMENT_POLICY_MONITORS_RESOURCE = "Video";
    public static final String COMMENT_POLICY_MONITORS_FEEDBACK = "CommentOnVideo";

    public static final String REPORT_POLICY_NAME = "ReportedContentModeration";
    public static final ModerationMode REPORT_POLICY_MODE = ModerationMode.MANUAL;
    public static final TriggerEvent REPORT_POLICY_TRIGGER = TriggerEvent.ON_REPORT_THRESHOLD;
    public static final ModerationDecision REPORT_POLICY_DECISION = ModerationDecision.HIDDEN;
    public static final String REPORT_POLICY_MONITORS_RESOURCE = "Content";
    public static final String REPORT_POLICY_MONITORS_FEEDBACK = "ReportContent";

    public static final String VIDEO_AUTOMATION_RULE_NAME = "AutoVideoCopyrightCheck";
    public static final ConditionOperator VIDEO_CONDITION_OPERATOR = ConditionOperator.CONTAINS_KEYWORDS;
    public static final String VIDEO_CONDITION_ATTRIBUTE = "video_title_and_description";
    public static final List<String> VIDEO_BLOCKED_KEYWORDS = List.of("copyright", "reupload", "unlicensed");
    public static final String VIDEO_ACTION_NAME = "FlagVideo";
    public static final ActionKind VIDEO_ACTION_KIND = ActionKind.FLAG_CONTENT;
    public static final VideoModerationType VIDEO_CHECK_TYPE = VideoModerationType.COPYRIGHT;
    public static final VideoModerationResult VIDEO_DECISION_ON_MATCH = VideoModerationResult.FLAGGED;

    public static final String COMMENT_AUTOMATION_RULE_NAME = "AutoCommentModerationCheck";
    public static final ConditionOperator COMMENT_CONDITION_OPERATOR = ConditionOperator.CONTAINS_KEYWORDS;
    public static final String COMMENT_CONDITION_ATTRIBUTE = "comment_text";
    public static final List<String> COMMENT_BLOCKED_KEYWORDS = List.of("spam", "toxicity", "blocked-word");
    public static final String COMMENT_ACTION_NAME = "FlagComment";
    public static final ActionKind COMMENT_ACTION_KIND = ActionKind.FLAG_CONTENT;
    public static final CommentModerationType COMMENT_CHECK_TYPE = CommentModerationType.BLOCKED_WORD;
    public static final CommentModerationResult COMMENT_DECISION_ON_MATCH = CommentModerationResult.FLAGGED;

    public static final String REPORT_AUTOMATION_RULE_NAME = "AutoReportEscalation";
    public static final String REPORT_ACTION_NAME = "HideReportedContent";
    public static final ActionKind REPORT_ACTION_KIND = ActionKind.HIDE_CONTENT;

    private GeneratedModerationModel() {
    }
}
