package generated.reddit.model;

import java.util.List;

public final class Feedback {
    private Feedback() {
    }

    public record FeedbackTypeSpec(String name, String kind, String subjectScope, boolean hasRating, boolean recursive, boolean allowsText, boolean allowsMedia, String polarity) {}
    public record FeedbackDefinitionSpec(String name, boolean requiresVerifiedContext, String verificationRequirement, boolean uniquePerAuthorTarget, String targetKind, String targetName, String endpoint) {}

    public static List<FeedbackTypeSpec> types() {
        return List.of(
                new FeedbackTypeSpec("PostComment", "COMMENT", "RESOURCE_ONLY", false, false, true, true, "NONE"),
                new FeedbackTypeSpec("ReplyComment", "COMMENT", "FEEDBACK_ONLY", false, true, true, true, "NONE"),
                new FeedbackTypeSpec("Vote", "VOTE", "RESOURCE_OR_FEEDBACK", false, false, false, false, "UP_DOWN"),
                new FeedbackTypeSpec("Report", "REPORT", "RESOURCE_OR_FEEDBACK", false, false, true, false, "NONE"),
                new FeedbackTypeSpec("SubredditSubscription", "SUBSCRIPTION", "RESOURCE_ONLY", false, false, false, false, "NONE")        );
    }

    public static List<FeedbackDefinitionSpec> definitions() {
        return List.of(
                new FeedbackDefinitionSpec("CommentOnPost", false, "NONE", false, "RESOURCE", "Post", "/api/feedback/commentOnPost"),
                new FeedbackDefinitionSpec("ReplyToComment", false, "NONE", false, "FEEDBACK", "CommentOnPost", "/api/feedback/replyToComment"),
                new FeedbackDefinitionSpec("VoteOnContent", false, "NONE", true, "RESOURCE", "Content", "/api/feedback/voteOnContent"),
                new FeedbackDefinitionSpec("VoteOnComment", false, "NONE", true, "FEEDBACK", "CommentOnPost", "/api/feedback/voteOnComment"),
                new FeedbackDefinitionSpec("ReportContent", false, "NONE", false, "RESOURCE", "Content", "/api/feedback/reportContent"),
                new FeedbackDefinitionSpec("ReportComment", false, "NONE", false, "FEEDBACK", "CommentOnPost", "/api/feedback/reportComment"),
                new FeedbackDefinitionSpec("SubscribeToSubreddit", false, "NONE", true, "RESOURCE", "Subreddit", "/api/feedback/subscribeToSubreddit")        );
    }
}
