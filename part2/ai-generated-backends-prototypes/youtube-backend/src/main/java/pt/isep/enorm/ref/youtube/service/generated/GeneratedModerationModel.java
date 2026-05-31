package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;

import pt.isep.enorm.ref.youtube.domain.enums.CommentModerationResult;
import pt.isep.enorm.ref.youtube.domain.enums.CommentModerationType;
import pt.isep.enorm.ref.youtube.domain.enums.UserKind;
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
        CONTAINS_KEYWORDS,
        HAS_PROPERTY,
        HAS_SPECIFIC_PROPERTY
    }

    public enum ActionKind {
        FLAG_CONTENT,
        HIDE_CONTENT,
        NOTIFY_MODERATOR
    }

    public static final List<PolicySpec> POLICIES = List.of(
        new PolicySpec(
            "VideoCreationModeration",
            "Video",
            null,
            ModerationMode.HYBRID,
            TriggerEvent.ON_RESOURCE_CREATE,
            ModerationDecision.FLAGGED,
            UserKind.MODERATOR,
            null,
            List.of(
                new AutomationRuleSpec(
                    "AutoVideoCopyrightCheck",
                    TriggerEvent.ON_RESOURCE_CREATE,
                    List.of(
                        new ConditionSpec(
                            "VideoDescriptionExists",
                            ConditionOperator.HAS_PROPERTY,
                            "video_description",
                            List.of("description")
                        ),
                        new ConditionSpec(
                            "VideoContainsCopyrightRiskKeywords",
                            ConditionOperator.CONTAINS_KEYWORDS,
                            "video_title_and_description",
                            List.of("copyright", "reupload", "unlicensed")
                        )
                    ),
                    List.of(
                        new ActionSpec(
                            "FlagVideo",
                            ActionKind.FLAG_CONTENT,
                            "set video.status='UNDER_REVIEW'; create VideoModerationCheck(type='COPYRIGHT', result='FLAGGED')"
                        ),
                        new ActionSpec(
                            "NotifyModeratorAboutVideo",
                            ActionKind.NOTIFY_MODERATOR,
                            "send moderation notification with channel id, video id, title, description excerpt, and matched keywords"
                        )
                    )
                )
            )
        ),
        new PolicySpec(
            "CommentCreationModeration",
            "Video",
            "CommentOnVideo",
            ModerationMode.HYBRID,
            TriggerEvent.ON_FEEDBACK_CREATE,
            ModerationDecision.FLAGGED,
            UserKind.MODERATOR,
            null,
            List.of(
                new AutomationRuleSpec(
                    "AutoCommentModerationCheck",
                    TriggerEvent.ON_FEEDBACK_CREATE,
                    List.of(
                        new ConditionSpec(
                            "CommentTextExists",
                            ConditionOperator.HAS_PROPERTY,
                            "comment_text",
                            List.of("text")
                        ),
                        new ConditionSpec(
                            "CommentContainsRiskyTerms",
                            ConditionOperator.CONTAINS_KEYWORDS,
                            "comment_text",
                            List.of("spam", "toxicity", "blocked-word")
                        )
                    ),
                    List.of(
                        new ActionSpec(
                            "FlagComment",
                            ActionKind.FLAG_CONTENT,
                            "set comment.status='UNDER_REVIEW'; create CommentModerationCheck(type='POLICY', result='FLAGGED')"
                        ),
                        new ActionSpec(
                            "NotifyModeratorAboutComment",
                            ActionKind.NOTIFY_MODERATOR,
                            "publish moderator event with comment id, video id, author id, normalized text, and matched terms"
                        )
                    )
                )
            )
        ),
        new PolicySpec(
            "ReportedContentModeration",
            "Content",
            "ReportContent",
            ModerationMode.MANUAL,
            TriggerEvent.ON_REPORT_THRESHOLD,
            ModerationDecision.HIDDEN,
            UserKind.MODERATOR,
            null,
            List.of(
                new AutomationRuleSpec(
                    "AutoReportEscalation",
                    TriggerEvent.ON_REPORT_THRESHOLD,
                    List.of(
                        new ConditionSpec(
                            "ReportThresholdReached",
                            ConditionOperator.HAS_SPECIFIC_PROPERTY,
                            "report_status",
                            List.of("PENDING")
                        )
                    ),
                    List.of(
                        new ActionSpec(
                            "HideReportedContent",
                            ActionKind.HIDE_CONTENT,
                            "set content.visibility='HIDDEN'; persist escalation record; freeze recommendation exposure"
                        ),
                        new ActionSpec(
                            "NotifyModeratorAboutReportedContent",
                            ActionKind.NOTIFY_MODERATOR,
                            "send escalation packet containing content id, report count, threshold rule, last status, and history"
                        )
                    )
                )
            )
        )
    );

    public static final PolicySpec VIDEO_POLICY = POLICIES.get(0);
    public static final PolicySpec COMMENT_POLICY = POLICIES.get(1);
    public static final PolicySpec REPORT_POLICY = POLICIES.get(2);

    public static final AutomationRuleSpec VIDEO_AUTOMATION_RULE = VIDEO_POLICY.getAutomationRules().get(0);
    public static final AutomationRuleSpec COMMENT_AUTOMATION_RULE = COMMENT_POLICY.getAutomationRules().get(0);
    public static final AutomationRuleSpec REPORT_AUTOMATION_RULE = REPORT_POLICY.getAutomationRules().get(0);

    public static final String VIDEO_POLICY_NAME = VIDEO_POLICY.getName();
    public static final ModerationMode VIDEO_POLICY_MODE = VIDEO_POLICY.getMode();
    public static final TriggerEvent VIDEO_POLICY_TRIGGER = VIDEO_POLICY.getTrigger();
    public static final ModerationDecision VIDEO_POLICY_DECISION = VIDEO_POLICY.getDecision();
    public static final String VIDEO_POLICY_MONITORS_RESOURCE = VIDEO_POLICY.getResourceTarget();
    public static final String VIDEO_POLICY_MONITORS_FEEDBACK = VIDEO_POLICY.getFeedbackTarget();
    public static final UserKind VIDEO_POLICY_EXECUTED_BY_KIND = VIDEO_POLICY.getExecutedByKind();
    public static final String VIDEO_POLICY_CONTEXT = VIDEO_POLICY.getContext();

    public static final String COMMENT_POLICY_NAME = COMMENT_POLICY.getName();
    public static final ModerationMode COMMENT_POLICY_MODE = COMMENT_POLICY.getMode();
    public static final TriggerEvent COMMENT_POLICY_TRIGGER = COMMENT_POLICY.getTrigger();
    public static final ModerationDecision COMMENT_POLICY_DECISION = COMMENT_POLICY.getDecision();
    public static final String COMMENT_POLICY_MONITORS_RESOURCE = COMMENT_POLICY.getResourceTarget();
    public static final String COMMENT_POLICY_MONITORS_FEEDBACK = COMMENT_POLICY.getFeedbackTarget();
    public static final UserKind COMMENT_POLICY_EXECUTED_BY_KIND = COMMENT_POLICY.getExecutedByKind();
    public static final String COMMENT_POLICY_CONTEXT = COMMENT_POLICY.getContext();

    public static final String REPORT_POLICY_NAME = REPORT_POLICY.getName();
    public static final ModerationMode REPORT_POLICY_MODE = REPORT_POLICY.getMode();
    public static final TriggerEvent REPORT_POLICY_TRIGGER = REPORT_POLICY.getTrigger();
    public static final ModerationDecision REPORT_POLICY_DECISION = REPORT_POLICY.getDecision();
    public static final String REPORT_POLICY_MONITORS_RESOURCE = REPORT_POLICY.getResourceTarget();
    public static final String REPORT_POLICY_MONITORS_FEEDBACK = REPORT_POLICY.getFeedbackTarget();
    public static final UserKind REPORT_POLICY_EXECUTED_BY_KIND = REPORT_POLICY.getExecutedByKind();
    public static final String REPORT_POLICY_CONTEXT = REPORT_POLICY.getContext();

    public static final String VIDEO_AUTOMATION_RULE_NAME = VIDEO_AUTOMATION_RULE.getName();
    public static final List<ConditionSpec> VIDEO_CONDITIONS = VIDEO_AUTOMATION_RULE.getConditions();
    public static final List<ActionSpec> VIDEO_ACTIONS = VIDEO_AUTOMATION_RULE.getActions();
    public static final VideoModerationType VIDEO_CHECK_TYPE = VideoModerationType.COPYRIGHT;
    public static final VideoModerationResult VIDEO_DECISION_ON_MATCH = VideoModerationResult.FLAGGED;

    public static final String COMMENT_AUTOMATION_RULE_NAME = COMMENT_AUTOMATION_RULE.getName();
    public static final List<ConditionSpec> COMMENT_CONDITIONS = COMMENT_AUTOMATION_RULE.getConditions();
    public static final List<ActionSpec> COMMENT_ACTIONS = COMMENT_AUTOMATION_RULE.getActions();
    public static final CommentModerationType COMMENT_CHECK_TYPE = CommentModerationType.BLOCKED_WORD;
    public static final CommentModerationResult COMMENT_DECISION_ON_MATCH = CommentModerationResult.FLAGGED;

    public static final String REPORT_AUTOMATION_RULE_NAME = REPORT_AUTOMATION_RULE.getName();
    public static final List<ConditionSpec> REPORT_CONDITIONS = REPORT_AUTOMATION_RULE.getConditions();
    public static final List<ActionSpec> REPORT_ACTIONS = REPORT_AUTOMATION_RULE.getActions();

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
