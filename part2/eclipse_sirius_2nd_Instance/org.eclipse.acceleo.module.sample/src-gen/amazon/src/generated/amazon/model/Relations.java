package generated.amazon.model;

import java.util.List;

public final class Relations {
private Relations() {
}

public record RelationSpec(String name, String sourceCardinality, String targetCardinality, boolean containment, boolean recursive, String source, String target) {}

public static List<RelationSpec> all() {
return List.of(
new RelationSpec("orderContainsItems", "1", "*", true, false, "Order", "OrderItem")
,new RelationSpec("orderItemProduct", "*", "1", false, false, "OrderItem", "Product")
,new RelationSpec("productReceivesReviews", "1", "*", false, false, "Product", "ProductReview")
,new RelationSpec("reviewHasAttachments", "1", "*", true, false, "ProductReview", "MediaAttachment")
,new RelationSpec("productUsesReviewPolicy", "1", "1", true, false, "Product", "ReviewPolicy")
,new RelationSpec("reviewHasVerification", "0..1", "1", true, false, "ProductReview", "VerificationProcess")
,new RelationSpec("reviewHasModerationChecks", "1", "*", true, false, "ProductReview", "ReviewModerationCheck")
,new RelationSpec("reviewHasVotes", "1", "*", true, false, "ProductReview", "HelpfulVote")
,new RelationSpec("reviewUsesRatingPolicy", "*", "1", false, false, "ProductReview", "RatingPolicy")
,new RelationSpec("reviewConstrainedByPolicy", "*", "1", false, false, "ProductReview", "ReviewPolicy")
,new RelationSpec("helpfulVoteOnReview", "*", "1", false, false, "HelpfulVote", "ProductReview")
);
}
}
