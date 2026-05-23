package generated.youTube.governance;

import java.util.List;

public final class YouTubeGovernance {
private YouTubeGovernance() {
}

public record AuthorizationSpec(String name, String allowedAction, String actor, String appContext, String resourceTarget, String feedbackTarget) {}
public record ValidationSpec(String name, String kind, String severity, String expression, String implementationBody, String appliesToResource, String appliesToFeedback, String invokedBy) {}
public record ModerationPolicySpec(String name, String mode, String trigger, String decision, String monitorsResource, String monitorsFeedback, List<String> executedBy, String inContext) {}
public record VerificationPolicySpec(String name, String mode, String appliesWhen, String verifies) {}
public record SortingPolicySpec(String name, String criterion, String direction, String appliesToResource, String appliesToFeedback, String inContext) {}

public static List<AuthorizationSpec> authorizations() {
return List.of(
new AuthorizationSpec("UserReadChannel", "READ", "User", , "Channel", null)
,new AuthorizationSpec("CreatorCreateVideo", "CREATE", "Creator", , "Video", null)
,new AuthorizationSpec("CreatorUpdateVideo", "UPDATE", "Creator", , "Video", null)
,new AuthorizationSpec("UserCommentVideo", "COMMENT", "User", , "Video", "CommentOnVideo")
,new AuthorizationSpec("UserReplyComment", "COMMENT", "User", , "Comment", "ReplyToComment")
,new AuthorizationSpec("UserReactContent", "VOTE", "User", , "Content", "LikeOnContent")
,new AuthorizationSpec("UserReportContent", "REPORT", "User", , "Content", "ReportContent")
,new AuthorizationSpec("UserSubscribeChannel", "SUBSCRIBE", "User", , "Channel", "SubscribeToChannel")
,new AuthorizationSpec("ModeratorModerateVideo", "MODERATE", "Moderator", , "Video", null)
,new AuthorizationSpec("ModeratorModerateComment", "MODERATE", "Moderator", , "Comment", null)
,new AuthorizationSpec("ModeratorValidateContent", "VALIDATE", "Moderator", , "Content", null)
);
}

public static List<ValidationSpec> validations() {
return List.of(
new ValidationSpec("VideoCopyrightValidation", "AUTOMATIC", "ERROR", "Validate uploaded video metadata for copyright-risk indicators before publication.", "impl: let desc = lower(coalesce(attr_video_description,'')); let title = lower(coalesce(attr_video_title,'')); let risky = containsAny(desc + ' ' + title, ['copyright','reupload','unlicensed']); if risky then create VideoModerationCheck(type='COPYRIGHT', result='FLAGGED', timestamp=now()); set video.status='UNDER_REVIEW'; notify moderator with video id and matched terms; return ERROR; else set video.status='READY'; return OK; end", "Video", null, "AutoVideoCopyrightCheck")
,new ValidationSpec("VideoCommunityGuidelinesValidation", "AUTOMATIC", "WARNING", "Validate video lifecycle fields and status transitions against platform community-guidelines rules.", "impl: require attr_content_status; if matches(attr_content_status,'REMOVED') then return WARNING; end; if trim(coalesce(attr_video_description,'')) = '' then emit creator warning 'Description should be present'; end; if attr_video_comment_status not in ['OPEN','HELD','DISABLED'] then set video.status='UNDER_REVIEW'; notify moderator; end; return OK", "Video", null, "AutoVideoGuidelinesCheck")
,new ValidationSpec("CommentPolicyValidation", "AUTOMATIC", "WARNING", "Validate comment text against spam, toxicity, and blocked-term moderation rules.", "impl: let text = lower(trim(attr_comment_text)); let risky = containsAny(text, ['spam','toxicity','blocked-word']); if risky then create CommentModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); set comment.status='UNDER_REVIEW'; notify moderator with comment id and matched terms; return WARNING; else return OK; end", null, "CommentOnVideo", "AutoCommentModerationCheck")
,new ValidationSpec("ReportThresholdValidation", "AUTOMATIC", "ERROR", "Validate whether reported content reached the moderation threshold and must be escalated immediately.", "impl: if attr_content_status = 'UNDER_REVIEW' then hide content; create moderation escalation record; notify moderator queue; return ERROR; else return OK; end", null, "ReportContent", "AutoReportEscalation")
);
}

public static List<ModerationPolicySpec> moderationPolicies() {
return List.of(
new ModerationPolicySpec("VideoCreationModeration", "HYBRID", "ON_RESOURCE_CREATE", "FLAGGED", "Video", null, List.of("Moderator"), "PlatformGlobal")
,new ModerationPolicySpec("CommentCreationModeration", "HYBRID", "ON_FEEDBACK_CREATE", "FLAGGED", "Video", "CommentOnVideo", List.of("Moderator"), "ChannelSpace")
,new ModerationPolicySpec("ReportedContentModeration", "MANUAL", "ON_REPORT_THRESHOLD", "HIDDEN", "Content", "ReportContent", List.of("Moderator"), "PlatformGlobal")
);
}

public static List<VerificationPolicySpec> verificationPolicies() {
return List.of(
new VerificationPolicySpec("ReportReviewVerification", "MANUAL", "ON_REPORT_SUBMITTED", "ReportContent")
,new VerificationPolicySpec("CommentModerationVerification", "AUTOMATIC", "ON_FEEDBACK_CREATE", "CommentOnVideo")
);
}

public static List<SortingPolicySpec> sortingPolicies() {
return List.of(
new SortingPolicySpec("ChannelLatestVideos", "DATE", "DESC", "Video", null, "ChannelSpace")
,new SortingPolicySpec("ChannelRelevantContent", "RELEVANCE", "DESC", "Content", null, "ChannelSpace")
,new SortingPolicySpec("GlobalHighValueContent", "VALUE", "DESC", "Content", null, "PlatformGlobal")
);
}
}
