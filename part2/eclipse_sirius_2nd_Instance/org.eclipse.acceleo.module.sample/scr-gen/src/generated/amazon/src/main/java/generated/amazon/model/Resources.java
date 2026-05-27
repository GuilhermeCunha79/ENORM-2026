package generated.amazon.model;

import java.util.List;

public final class Resources {
    private Resources() {
    }

    public record ProductSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record OrderSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record OrderItemSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record ProductReviewSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record MediaAttachmentSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record HelpfulVoteSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record VerificationProcessSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record ReviewPolicySpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record ReviewModerationCheckSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record RatingPolicySpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}

    public static List<Object> all() {
        return List.of(
                new ProductSpec("Product", true, List.of(), "/api/products"),
                new OrderSpec("Order", false, List.of(), "/api/orders"),
                new OrderItemSpec("OrderItem", false, List.of(), "/api/orderItems"),
                new ProductReviewSpec("ProductReview", true, List.of(), "/api/productReviews"),
                new MediaAttachmentSpec("MediaAttachment", true, List.of(), "/api/mediaAttachments"),
                new HelpfulVoteSpec("HelpfulVote", false, List.of(), "/api/helpfulVotes"),
                new VerificationProcessSpec("VerificationProcess", false, List.of(), "/api/verificationProcesss"),
                new ReviewPolicySpec("ReviewPolicy", false, List.of(), "/api/reviewPolicys"),
                new ReviewModerationCheckSpec("ReviewModerationCheck", false, List.of(), "/api/reviewModerationChecks"),
                new RatingPolicySpec("RatingPolicy", false, List.of(), "/api/ratingPolicys")        );
    }
}
