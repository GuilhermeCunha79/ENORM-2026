package pt.isep.enorm.ref.amazon.service.projection;

public record ProductRatingSummary(Long productId, double averageRating, long totalReviews) {
}
