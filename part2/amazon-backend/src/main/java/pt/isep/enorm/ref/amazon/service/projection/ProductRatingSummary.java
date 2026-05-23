package pt.isep.enorm.ref.amazon.service.projection;

public class ProductRatingSummary {
    private final Long productId;
    private final double averageStars;
    private final long totalReviews;

    public ProductRatingSummary(Long productId, double averageStars, long totalReviews) {
        this.productId = productId;
        this.averageStars = averageStars;
        this.totalReviews = totalReviews;
    }

    public Long getProductId() {
        return productId;
    }

    public double getAverageStars() {
        return averageStars;
    }

    public long getTotalReviews() {
        return totalReviews;
    }
}
