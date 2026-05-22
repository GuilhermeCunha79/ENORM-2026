package generated.amazon.model;

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
                "Review",
                "REVIEW",
                "RESOURCE_ONLY",
                true,
                false,
                true,
                true,
                "NONE"
            ),
            new FeedbackTypeSpec(
                "HelpfulVote",
                "VOTE",
                "FEEDBACK_ONLY",
                false,
                false,
                false,
                false,
                "UP_DOWN"
            )        );
    }

    public static List<FeedbackDefinitionSpec> definitions() {
        return List.of(
new FeedbackDefinitionSpec(
                "ProductReview",
                true,
                "REQUIRED",
                true,
                "Review",
                "Product",
                "Buyer",
                null,
                "ENABLED",
                "1.0",
                "5.0",
                "1.0"
            ),
            new FeedbackDefinitionSpec(
                "HelpfulVoteOnReview",
                false,
                "NONE",
                true,
                "HelpfulVote",
                null,
                "User",
                "ProductReview",
                "ENABLED",
                null,
                null,
                null
            )        );
    }
}
