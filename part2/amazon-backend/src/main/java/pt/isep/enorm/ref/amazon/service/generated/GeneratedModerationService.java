package pt.isep.enorm.ref.amazon.service.generated;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.domain.enums.ReviewStatus;
import pt.isep.enorm.ref.amazon.repository.ProductReviewRepository;
import pt.isep.enorm.ref.amazon.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedModerationService {

    private final ProductReviewRepository productReviewRepository;

    protected GeneratedModerationService(ProductReviewRepository productReviewRepository) {
        this.productReviewRepository = productReviewRepository;
    }

    @Transactional
    public void approveReview(AmazonUser moderator, Long reviewId) {
        if (moderator == null) {
            throw new IllegalArgumentException("Moderator is required.");
        }

        ProductReview review = productReviewRepository.findById(reviewId)
            .orElseThrow(() -> new ResourceNotFoundException("Review '%s' was not found.".formatted(reviewId)));
        review.setStatus(ReviewStatus.APPROVED);
        productReviewRepository.save(review);
    }
}
