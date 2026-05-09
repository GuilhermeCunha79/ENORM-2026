package pt.isep.enorm.ref.amazon.service.projection;

public record ProductRatingSummary(Long productId, double averageStars, long totalReviews) {
}