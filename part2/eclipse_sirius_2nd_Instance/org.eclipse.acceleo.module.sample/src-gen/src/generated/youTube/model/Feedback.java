package generated.youTube.model;

import java.util.List;

public final class Feedback {
    private Feedback() {
    }

    public record FeedbackTypeSpec(String name, String kind, String subjectScope, boolean hasRating, boolean recursive, boolean allowsText, boolean allowsMedia, String polarity) {}
    public record FeedbackDefinitionSpec(String name, boolean requiresVerifiedContext, String verificationRequirement, boolean uniquePerAuthorTarget, String targetKind, String targetName, String endpoint) {}

    public static List<FeedbackTypeSpec> types() {
        return List.of(
                new FeedbackTypeSpec("VideoCommentType", "COMMENT", "RESOURCE_ONLY", false, false, true, false, "NONE"),
                new FeedbackTypeSpec("ReplyCommentType", "COMMENT", "FEEDBACK_ONLY", false, true, true, false, "NONE"),
                new FeedbackTypeSpec("LikeReactionType", "REACTION", "RESOURCE_ONLY", false, false, false, false, "LIKE_DISLIKE"),
                new FeedbackTypeSpec("ReportType", "REPORT", "RESOURCE_ONLY", false, false, true, false, "NONE"),
                new FeedbackTypeSpec("ChannelSubscriptionType", "SUBSCRIPTION", "RESOURCE_ONLY", false, false, false, false, "NONE")        );
    }

    public static List<FeedbackDefinitionSpec> definitions() {
        return List.of(
                new FeedbackDefinitionSpec("CommentOnVideo", false, "NONE", false, "RESOURCE", "Video", "/api/feedback/commentOnVideo"),
                new FeedbackDefinitionSpec("ReplyToComment", false, "NONE", false, "FEEDBACK", "CommentOnVideo", "/api/feedback/replyToComment"),
                new FeedbackDefinitionSpec("LikeOnContent", false, "NONE", true, "RESOURCE", "Content", "/api/feedback/likeOnContent"),
                new FeedbackDefinitionSpec("ReportContent", false, "NONE", false, "RESOURCE", "Content", "/api/feedback/reportContent"),
                new FeedbackDefinitionSpec("SubscribeToChannel", false, "NONE", true, "RESOURCE", "Channel", "/api/feedback/subscribeToChannel")        );
    }
}
