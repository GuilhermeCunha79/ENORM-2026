package generated.amazon.governance;

import java.util.List;

public final class AmazonGovernance {
    private AmazonGovernance() {
    }

    public record AuthorizationSpec(String name, String action, String actor, String context, String resourceTarget, String feedbackTarget) {}
    public record ValidationSpec(String name, String kind, String severity, String appliesToResource, String appliesToFeedback) {}
    public record ModerationPolicySpec(String name, String mode, String trigger, String decision, String monitorsResource, String monitorsFeedback) {}
    public record VerificationPolicySpec(String name, String mode, String appliesWhen, String verifies) {}
    public record SortingPolicySpec(String name, String criterion, String direction, String appliesToResource, String appliesToFeedback, String inContext) {}

    public static List<AuthorizationSpec> authorizations() {
        return List.of(
                new AuthorizationSpec("BuyerReadProduct", "READ", "Buyer", "AmazonCatalog", "Product", null),
                new AuthorizationSpec("BuyerCreateProductReview", "CREATE", "Buyer", "AmazonCatalog", "Product", "ProductReview"),
                new AuthorizationSpec("UserVoteHelpful", "VOTE", "User", "AmazonCatalog", "Product", "HelpfulVoteOnReview"),
                new AuthorizationSpec("ModeratorModerateReview", "MODERATE", "Moderator", "ModerationBackoffice", "Product", "ProductReview")        );
    }

    public static List<ValidationSpec> validations() {
        return List.of(
                new ValidationSpec("ReviewContentCheck", "AUTOMATIC", "WARNING", null, "ProductReview")        );
    }

    public static List<ModerationPolicySpec> moderationPolicies() {
        return List.of(
                new ModerationPolicySpec("ReviewModerationOnCreate", "HYBRID", "ON_FEEDBACK_CREATE", "FLAGGED", "Product", "ProductReview")        );
    }

    public static List<VerificationPolicySpec> verificationPolicies() {
        return List.of(
                new VerificationPolicySpec("VerifiedPurchaseCheck", "AUTOMATIC", "ON_FEEDBACK_CREATE", "ProductReview")        );
    }

    public static List<SortingPolicySpec> sortingPolicies() {
        return List.of(
                new SortingPolicySpec("NewestReviews", "DATE", "DESC", null, "ProductReview", "AmazonCatalog"),
                new SortingPolicySpec("MostRelevantReviews", "RELEVANCE", "DESC", null, "ProductReview", "AmazonCatalog")        );
    }
}
