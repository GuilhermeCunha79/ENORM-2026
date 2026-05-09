package pt.isep.enorm.ref.amazon.web.dto;

public record ProductRatingSummaryResponse(Long productId, double averageStars, long totalReviews) {
}