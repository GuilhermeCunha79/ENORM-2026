package generated.youtube.governance;

import java.util.List;

public final class YouTubeGovernance {

    public record AuthorizationSpec(
        String name,
        String allowedAction,
        String actor,
        String context,
        String resourceTarget,
        String feedbackTarget
    ) {}

    public record ValidationSpec(
        String name,
        String kind,
        String severity,
        String expression,
        String implementationBody,
        String appliesToResource,
        String appliesToFeedback,
        String invokedBy
    ) {}

    public record ModerationPolicySpec(
        String name,
        String mode,
        String trigger,
        String decision,
        String monitorsResource,
        String monitorsFeedback,
        List<String> executedBy,
        String inContext
    ) {}

    public record ConditionSpec(
        String name,
        String operator,
        String attribute,
        List<String> values
    ) {}

    public record ActionSpec(
        String name,
        String kind,
        String implementationBody
    ) {}

    public record AutomationSpec(
        String name,
        String trigger,
        String contextResource,
        String inContext,
        String onFeedback,
        String usesValidation,
        List<ConditionSpec> conditions,
        List<ActionSpec> actions
    ) {}

    public record VerificationPolicySpec(
        String name,
        String mode,
        String appliesWhen,
        String verifies
    ) {}

    public record SortingPolicySpec(
        String name,
        String criterion,
        String direction,
        String appliesToResource,
        String appliesToFeedback,
        String inContext
    ) {}

    public List<AuthorizationSpec> authorizations() {
        return List.of(
new AuthorizationSpec(
                "UserReadChannel",
                "READ",
                "User",
                "ChannelSpace",
                "Channel",
                null
            ),
            new AuthorizationSpec(
                "CreatorCreateVideo",
                "CREATE",
                "Creator",
                "ChannelSpace",
                "Video",
                null
            ),
            new AuthorizationSpec(
                "CreatorUpdateVideo",
                "UPDATE",
                "Creator",
                "ChannelSpace",
                "Video",
                null
            ),
            new AuthorizationSpec(
                "UserCommentVideo",
                "COMMENT",
                "User",
                "ChannelSpace",
                "Video",
                "CommentOnVideo"
            ),
            new AuthorizationSpec(
                "UserReplyComment",
                "COMMENT",
                "User",
                "ChannelSpace",
                "Comment",
                "ReplyToComment"
            ),
            new AuthorizationSpec(
                "UserReactContent",
                "VOTE",
                "User",
                "ChannelSpace",
                "Content",
                "LikeOnContent"
            ),
            new AuthorizationSpec(
                "UserReportContent",
                "REPORT",
                "User",
                "PlatformGlobal",
                "Content",
                "ReportContent"
            ),
            new AuthorizationSpec(
                "UserSubscribeChannel",
                "SUBSCRIBE",
                "User",
                "ChannelSpace",
                "Channel",
                "SubscribeToChannel"
            ),
            new AuthorizationSpec(
                "ModeratorModerateVideo",
                "MODERATE",
                "Moderator",
                "PlatformGlobal",
                "Video",
                null
            ),
            new AuthorizationSpec(
                "ModeratorModerateComment",
                "MODERATE",
                "Moderator",
                "PlatformGlobal",
                "Comment",
                null
            ),
            new AuthorizationSpec(
                "ModeratorValidateContent",
                "VALIDATE",
                "Moderator",
                "PlatformGlobal",
                "Content",
                null
            )        );
    }

    public List<ValidationSpec> validations() {
        return List.of(
new ValidationSpec(
                "VideoCopyrightValidation",
                "AUTOMATIC",
                "ERROR",
                """
Validate uploaded video metadata for copyright-risk indicators before publication.
                """,
                """
impl: let desc = lower(coalesce(attr_video_description,'')); let title = lower(coalesce(attr_video_title,'')); let risky = containsAny(desc + ' ' + title, ['copyright','reupload','unlicensed']); if risky then create VideoModerationCheck(type='COPYRIGHT', result='FLAGGED', timestamp=now()); set video.status='UNDER_REVIEW'; notify moderator with video id and matched terms; return ERROR; else set video.status='READY'; return OK; end
                """,
                "Video",
                null,
                "AutoVideoCopyrightCheck"
            ),
            new ValidationSpec(
                "VideoCommunityGuidelinesValidation",
                "AUTOMATIC",
                "WARNING",
                """
Validate video lifecycle fields and status transitions against platform community-guidelines rules.
                """,
                """
impl: require attr_content_status; if matches(attr_content_status,'REMOVED') then return WARNING; end; if trim(coalesce(attr_video_description,'')) = '' then emit creator warning 'Description should be present'; end; if attr_video_comment_status not in ['OPEN','HELD','DISABLED'] then set video.status='UNDER_REVIEW'; notify moderator; end; return OK
                """,
                "Video",
                null,
                "AutoVideoGuidelinesCheck"
            ),
            new ValidationSpec(
                "CommentPolicyValidation",
                "AUTOMATIC",
                "WARNING",
                """
Validate comment text against spam, toxicity, and blocked-term moderation rules.
                """,
                """
impl: let text = lower(trim(attr_comment_text)); let risky = containsAny(text, ['spam','toxicity','blocked-word']); if risky then create CommentModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); set comment.status='UNDER_REVIEW'; notify moderator with comment id and matched terms; return WARNING; else return OK; end
                """,
                null,
                "CommentOnVideo",
                "AutoCommentModerationCheck"
            ),
            new ValidationSpec(
                "ReportThresholdValidation",
                "AUTOMATIC",
                "ERROR",
                """
Validate whether reported content reached the moderation threshold and must be escalated immediately.
                """,
                """
impl: if attr_content_status = 'UNDER_REVIEW' then hide content; create moderation escalation record; notify moderator queue; return ERROR; else return OK; end
                """,
                null,
                "ReportContent",
                "AutoReportEscalation"
            )        );
    }

    public List<ModerationPolicySpec> moderationPolicies() {
        return List.of(
new ModerationPolicySpec(
                "VideoCreationModeration",
                "HYBRID",
                "ON_RESOURCE_CREATE",
                "FLAGGED",
                "Video",
                null,
                List.of("Moderator"),
                "PlatformGlobal"
            ),
            new ModerationPolicySpec(
                "CommentCreationModeration",
                "HYBRID",
                "ON_FEEDBACK_CREATE",
                "FLAGGED",
                "Video",
                "CommentOnVideo",
                List.of("Moderator"),
                "ChannelSpace"
            ),
            new ModerationPolicySpec(
                "ReportedContentModeration",
                "MANUAL",
                "ON_REPORT_THRESHOLD",
                "HIDDEN",
                "Content",
                "ReportContent",
                List.of("Moderator"),
                "PlatformGlobal"
            )        );
    }

    public List<AutomationSpec> automations() {
        return List.of(
new AutomationSpec(
                "AutoVideoCopyrightCheck",
                "ON_RESOURCE_CREATE",
                "Video",
                "ChannelSpace",
                null,
                "VideoCopyrightValidation",
                List.of(
new ConditionSpec(
                        "VideoDescriptionExists",
                        "HAS_PROPERTY",
                        "description",
                        List.of("description")
                    ),
                    new ConditionSpec(
                        "VideoContainsCopyrightRiskKeywords",
                        "CONTAINS_KEYWORDS",
                        "description",
                        List.of("copyright", "reupload", "unlicensed")
                    )                ),
                List.of(
new ActionSpec(
                        "FlagVideo",
                        "FLAG_CONTENT",
                        """
impl: set video.status='UNDER_REVIEW'; create VideoModerationCheck(type='COPYRIGHT', result='FLAGGED', timestamp=now()); attach moderation reason to video state.
                        """
                    ),
                    new ActionSpec(
                        "NotifyModeratorAboutVideo",
                        "NOTIFY_MODERATOR",
                        """
impl: send moderation notification with channel id, video id, title, description excerpt, and matched copyright-risk keywords.
                        """
                    )                )
            ),
            new AutomationSpec(
                "AutoVideoGuidelinesCheck",
                "ON_RESOURCE_UPDATE",
                "Video",
                "ChannelSpace",
                null,
                "VideoCommunityGuidelinesValidation",
                List.of(
new ConditionSpec(
                        "VideoStatusPresent",
                        "HAS_SPECIFIC_PROPERTY",
                        "status",
                        List.of("status")
                    ),
                    new ConditionSpec(
                        "VideoStatusNotRemoved",
                        "NOT_MATCH_REGEX",
                        "status",
                        List.of("REMOVED")
                    )                ),
                List.of(
new ActionSpec(
                        "WarnCreator",
                        "DISPLAY_MESSAGE",
                        """
impl: display creator warning when description is missing, status transition is invalid, or comment settings conflict with platform rules.
                        """
                    )                )
            ),
            new AutomationSpec(
                "AutoCommentModerationCheck",
                "ON_FEEDBACK_CREATE",
                "Comment",
                "ChannelSpace",
                "CommentOnVideo",
                "CommentPolicyValidation",
                List.of(
new ConditionSpec(
                        "CommentTextExists",
                        "HAS_PROPERTY",
                        "text",
                        List.of("text")
                    ),
                    new ConditionSpec(
                        "CommentContainsRiskyTerms",
                        "CONTAINS_KEYWORDS",
                        "text",
                        List.of("spam", "toxicity", "blocked-word")
                    )                ),
                List.of(
new ActionSpec(
                        "FlagComment",
                        "FLAG_CONTENT",
                        """
impl: set comment.status='UNDER_REVIEW'; create CommentModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); keep comment hidden until moderator decision.
                        """
                    ),
                    new ActionSpec(
                        "NotifyModeratorAboutComment",
                        "NOTIFY_MODERATOR",
                        """
impl: publish moderator event with comment id, video id, author id, normalized text, and policy terms that triggered the check.
                        """
                    )                )
            ),
            new AutomationSpec(
                "AutoReportEscalation",
                "ON_REPORT_THRESHOLD",
                "Content",
                "PlatformGlobal",
                "ReportContent",
                "ReportThresholdValidation",
                List.of(
new ConditionSpec(
                        "ReportThresholdReached",
                        "HAS_SPECIFIC_PROPERTY",
                        "status",
                        List.of("UNDER_REVIEW")
                    )                ),
                List.of(
new ActionSpec(
                        "HideReportedContent",
                        "HIDE_CONTENT",
                        """
impl: set content.visibility='HIDDEN'; persist escalation record; freeze recommendation exposure until moderator resolution.
                        """
                    ),
                    new ActionSpec(
                        "NotifyModeratorAboutReportedContent",
                        "NOTIFY_MODERATOR",
                        """
impl: send escalation packet containing content id, report count, threshold rule, last status, and moderation history summary.
                        """
                    )                )
            )        );
    }

    public List<VerificationPolicySpec> verificationPolicies() {
        return List.of(
new VerificationPolicySpec(
                "ReportReviewVerification",
                "MANUAL",
                "ON_REPORT_SUBMITTED",
                "ReportContent"
            ),
            new VerificationPolicySpec(
                "CommentModerationVerification",
                "AUTOMATIC",
                "ON_FEEDBACK_CREATE",
                "CommentOnVideo"
            )        );
    }

    public List<SortingPolicySpec> sortingPolicies() {
        return List.of(
new SortingPolicySpec(
                "ChannelLatestVideos",
                "DATE",
                "DESC",
                "Video",
                null,
                "ChannelSpace"
            ),
            new SortingPolicySpec(
                "ChannelRelevantContent",
                "RELEVANCE",
                "DESC",
                "Content",
                null,
                "ChannelSpace"
            ),
            new SortingPolicySpec(
                "GlobalHighValueContent",
                "VALUE",
                "DESC",
                "Content",
                null,
                "PlatformGlobal"
            )        );
    }
}
