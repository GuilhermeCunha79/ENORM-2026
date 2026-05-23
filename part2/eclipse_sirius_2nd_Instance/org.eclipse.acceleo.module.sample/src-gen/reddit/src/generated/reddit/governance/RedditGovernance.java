package generated.reddit.governance;

import java.util.List;

public final class RedditGovernance {
private RedditGovernance() {
}

public record AuthorizationSpec(String name, String allowedAction, String actor, String appContext, String resourceTarget, String feedbackTarget) {}
public record ValidationSpec(String name, String kind, String severity, String expression, String implementationBody, String appliesToResource, String appliesToFeedback, String invokedBy) {}
public record ModerationPolicySpec(String name, String mode, String trigger, String decision, String monitorsResource, String monitorsFeedback, List<String> executedBy, String inContext) {}
public record VerificationPolicySpec(String name, String mode, String appliesWhen, String verifies) {}
public record SortingPolicySpec(String name, String criterion, String direction, String appliesToResource, String appliesToFeedback, String inContext) {}

public static List<AuthorizationSpec> authorizations() {
return List.of(
new AuthorizationSpec("UserReadSubreddit", "READ", "User", , "Subreddit", null)
,new AuthorizationSpec("UserCreateCommentOnPost", "COMMENT", "User", , "Post", "CommentOnPost")
,new AuthorizationSpec("UserReplyToComment", "COMMENT", "User", , "Comment", "ReplyToComment")
,new AuthorizationSpec("UserVoteContent", "VOTE", "User", , "Content", "VoteOnContent")
,new AuthorizationSpec("UserReportContent", "REPORT", "User", , "Content", "ReportContent")
,new AuthorizationSpec("UserSubscribeSubreddit", "SUBSCRIBE", "User", , "Subreddit", "SubscribeToSubreddit")
,new AuthorizationSpec("ModeratorModeratePost", "MODERATE", "Moderator", , "Post", null)
,new AuthorizationSpec("ModeratorModerateComment", "MODERATE", "Moderator", , "Comment", null)
,new AuthorizationSpec("ModeratorValidateContent", "VALIDATE", "Moderator", , "Content", null)
);
}

public static List<ValidationSpec> validations() {
return List.of(
new ValidationSpec("PostContentPolicyCheck", "AUTOMATIC", "WARNING", "Validate post content against subreddit rules, keyword screens, and platform-level moderation heuristics.", "impl: let body = lower(coalesce(attr_post_body,'')); let title = lower(coalesce(attr_post_title,'')); let risky = containsAny(title + ' ' + body, ['spam','offensive','banned-link']); if risky then create PostModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); set post.status='UNDER_REVIEW'; notify moderator with subreddit id, post id, and matched terms; return WARNING; else return OK; end", "Post", null, "AutoPostContentScreening")
,new ValidationSpec("CommentContentPolicyCheck", "AUTOMATIC", "WARNING", "Validate comment content against subreddit rules and abusive-language moderation patterns.", "impl: let body = lower(trim(attr_comment_body)); let risky = containsAny(body, ['spam','offensive','abuse']); if risky then create CommentModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); set comment.status='UNDER_REVIEW'; notify moderator with comment id and matched terms; return WARNING; else return OK; end", "Comment", null, "AutoCommentContentScreening")
,new ValidationSpec("ReportThresholdEscalation", "AUTOMATIC", "ERROR", "Validate whether report volume crossed the moderation threshold and the content must be hidden pending review.", "impl: if hasFlag('report-threshold-reached') then set content.visibility='HIDDEN'; create threshold escalation record; notify moderator queue with report summary; return ERROR; else return OK; end", null, "ReportContent", "AutoReportThresholdEscalation")
);
}

public static List<ModerationPolicySpec> moderationPolicies() {
return List.of(
new ModerationPolicySpec("PostModerationPolicy", "HYBRID", "ON_RESOURCE_CREATE", "FLAGGED", "Post", null, List.of("Moderator"), "RedditPlatform")
,new ModerationPolicySpec("CommentModerationPolicy", "HYBRID", "ON_RESOURCE_CREATE", "FLAGGED", "Comment", null, List.of("Moderator"), "RedditPlatform")
,new ModerationPolicySpec("ReportModerationPolicy", "MANUAL", "ON_REPORT_THRESHOLD", "HIDDEN", "Content", "ReportContent", List.of("Moderator"), "RedditPlatform")
);
}

public static List<VerificationPolicySpec> verificationPolicies() {
return List.of(
new VerificationPolicySpec("ModeratorReviewReports", "MANUAL", "ON_REPORT_SUBMITTED", "ReportContent")
);
}

public static List<SortingPolicySpec> sortingPolicies() {
return List.of(
new SortingPolicySpec("PostsNewestFirst", "DATE", "DESC", "Post", null, "SubredditCommunity")
,new SortingPolicySpec("ContentByRelevance", "RELEVANCE", "DESC", "Content", null, "ContentChannel")
,new SortingPolicySpec("ContentByScore", "VALUE", "DESC", "Content", null, "RedditPlatform")
);
}
}
