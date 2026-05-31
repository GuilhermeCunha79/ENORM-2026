package pt.isep.enorm.ref.service.projection;

public record ProductRatingSummary(Long productId, double averageRating, long totalReviews) {
}
