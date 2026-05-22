package generated.youtube.model;

import java.util.List;

public final class Feedback {

    private Feedback() {
    }

    public record FeedbackTypeSpec(
        String name,
        String kind,
        String subjectScope,
        boolean hasRating,
        boolean recursive,
        boolean allowsText,
        boolean allowsMedia,
        String polarity
    ) {}

    public record FeedbackDefinitionSpec(
        String name,
        boolean requiresVerifiedContext,
        String verificationRequirement,
        boolean uniquePerAuthorTarget,
        String type,
        String subjectResource,
        String author,
        String subjectFeedback,
        String policyStatus,
        String ratingMin,
        String ratingMax,
        String ratingStep
    ) {}

    public static List<FeedbackTypeSpec> types() {
        return List.of(
new FeedbackTypeSpec(
                "VideoCommentType",
                "COMMENT",
                "RESOURCE_ONLY",
                false,
                false,
                true,
                false,
                "NONE"
            ),
            new FeedbackTypeSpec(
                "ReplyCommentType",
                "COMMENT",
                "FEEDBACK_ONLY",
                false,
                true,
                true,
                false,
                "NONE"
            ),
            new FeedbackTypeSpec(
                "LikeReactionType",
                "REACTION",
                "RESOURCE_ONLY",
                false,
                false,
                false,
                false,
                "LIKE_DISLIKE"
            ),
            new FeedbackTypeSpec(
                "ReportType",
                "REPORT",
                "RESOURCE_ONLY",
                false,
                false,
                true,
                false,
                "NONE"
            ),
            new FeedbackTypeSpec(
                "ChannelSubscriptionType",
                "SUBSCRIPTION",
                "RESOURCE_ONLY",
                false,
                false,
                false,
                false,
                "NONE"
            )        );
    }

    public static List<FeedbackDefinitionSpec> definitions() {
        return List.of(
new FeedbackDefinitionSpec(
                "CommentOnVideo",
                false,
                "NONE",
                false,
                "VideoCommentType",
                "Video",
                "User",
                null,
                "ENABLED",
                null,
                null,
                null
            ),
            new FeedbackDefinitionSpec(
                "ReplyToComment",
                false,
                "NONE",
                false,
                "ReplyCommentType",
                null,
                "User",
                "CommentOnVideo",
                "ENABLED",
                null,
                null,
                null
            ),
            new FeedbackDefinitionSpec(
                "LikeOnContent",
                false,
                "NONE",
                true,
                "LikeReactionType",
                "Content",
                "User",
                null,
                "ENABLED",
                null,
                null,
                null
            ),
            new FeedbackDefinitionSpec(
                "ReportContent",
                false,
                "NONE",
                false,
                "ReportType",
                "Content",
                "User",
                null,
                "ENABLED",
                null,
                null,
                null
            ),
            new FeedbackDefinitionSpec(
                "SubscribeToChannel",
                false,
                "NONE",
                true,
                "ChannelSubscriptionType",
                "Channel",
                "User",
                null,
                "ENABLED",
                null,
                null,
                null
            )        );
    }
}
