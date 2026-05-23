package generated.reddit.model;

import java.util.List;

public final class Feedback {
private Feedback() {
}

public record FeedbackTypeSpec(String name, String kind, String subjectScope, boolean hasRating, boolean recursive, boolean allowsText, boolean allowsMedia, String polarity) {}
public record FeedbackDefinitionSpec(String name, boolean requiresVerifiedContext, String verificationRequirement, boolean uniquePerAuthorTarget, String type, String targetKind, String targetName, String author, String policyStatus, String ratingMin, String ratingMax, String ratingStep) {}

public static List<FeedbackTypeSpec> types() {
return List.of(
new FeedbackTypeSpec("PostComment", "COMMENT", "RESOURCE_ONLY", false, false, true, true, "NONE")
,new FeedbackTypeSpec("ReplyComment", "COMMENT", "FEEDBACK_ONLY", false, true, true, true, "NONE")
,new FeedbackTypeSpec("Vote", "VOTE", "RESOURCE_OR_FEEDBACK", false, false, false, false, "UP_DOWN")
,new FeedbackTypeSpec("Report", "REPORT", "RESOURCE_OR_FEEDBACK", false, false, true, false, "NONE")
,new FeedbackTypeSpec("SubredditSubscription", "SUBSCRIPTION", "RESOURCE_ONLY", false, false, false, false, "NONE")
);
}

public static List<FeedbackDefinitionSpec> definitions() {
return List.of(
new FeedbackDefinitionSpec("CommentOnPost", false, "NONE", false, "PostComment", "RESOURCE", "Post", "User", "ENABLED", null, null, null)
,new FeedbackDefinitionSpec("ReplyToComment", false, "NONE", false, "ReplyComment", "FEEDBACK", "CommentOnPost", "User", "ENABLED", null, null, null)
,new FeedbackDefinitionSpec("VoteOnContent", false, "NONE", true, "Vote", "RESOURCE", "Content", "User", "ENABLED", null, null, null)
,new FeedbackDefinitionSpec("VoteOnComment", false, "NONE", true, "Vote", "FEEDBACK", "CommentOnPost", "User", "ENABLED", null, null, null)
,new FeedbackDefinitionSpec("ReportContent", false, "NONE", false, "Report", "RESOURCE", "Content", "User", "ENABLED", null, null, null)
,new FeedbackDefinitionSpec("ReportComment", false, "NONE", false, "Report", "FEEDBACK", "CommentOnPost", "User", "ENABLED", null, null, null)
,new FeedbackDefinitionSpec("SubscribeToSubreddit", false, "NONE", true, "SubredditSubscription", "RESOURCE", "Subreddit", "User", "ENABLED", null, null, null)
);
}
}
