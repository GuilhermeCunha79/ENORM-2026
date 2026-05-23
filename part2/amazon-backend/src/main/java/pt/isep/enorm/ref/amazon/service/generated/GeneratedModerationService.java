package pt.isep.enorm.ref.amazon.service.generated;

import java.util.List;
import java.util.Locale;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.domain.enums.ReviewStatus;
import pt.isep.enorm.ref.amazon.repository.ProductReviewRepository;
import pt.isep.enorm.ref.amazon.service.projection.ReviewModerationSimulationResult;
import pt.isep.enorm.ref.amazon.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedModerationService {

    private static final List<String> DEFAULT_REJECTION_SIGNALS = List.of(
        "spam",
        "click here",
        "free money",
        "buy now",
        "malware",
        "hate",
        "kill",
        "idiot"
    );

    private final ProductReviewRepository productReviewRepository;

    protected GeneratedModerationService(ProductReviewRepository productReviewRepository) {
        this.productReviewRepository = productReviewRepository;
    }

    @Transactional
    public ReviewModerationSimulationResult simulateReviewModeration(AmazonUser moderator, Long reviewId) {
        ensureModerator(moderator);

        ProductReview review = loadReview(reviewId);
        return moderateReview(moderator, review);
    }

    @Transactional
    public List<ReviewModerationSimulationResult> simulatePendingReviews(AmazonUser moderator) {
        ensureModerator(moderator);

        return productReviewRepository.findByStatus(ReviewStatus.PENDING)
            .stream()
            .map(review -> moderateReview(moderator, review))
            .toList();
    }

    protected ReviewModerationDecision decideReview(ProductReview review) {
        String normalized = normalize(review.getComment());

        if (rejectionSignals().stream().anyMatch(normalized::contains)) {
            return new ReviewModerationDecision(
                ReviewStatus.REJECTED,
                "AUTO_REJECT",
                "Rejected by simulated moderation because the review contains a blocked content signal."
            );
        }

        if (review.isVerifiedBuyerAtSubmission()) {
            return new ReviewModerationDecision(
                ReviewStatus.APPROVED,
                "AUTO_APPROVE_VERIFIED_BUYER",
                "Approved by simulated moderation because the author was verified at submission time."
            );
        }

        return new ReviewModerationDecision(
            ReviewStatus.APPROVED,
            "MANUAL_APPROVE_SIMULATED",
            "Approved by simulated manual moderation; no blocked signal was found."
        );
    }

    protected List<String> rejectionSignals() {
        return DEFAULT_REJECTION_SIGNALS;
    }

    private ReviewModerationSimulationResult moderateReview(AmazonUser moderator, ProductReview review) {
        ReviewStatus previousStatus = review.getStatus();
        ReviewModerationDecision decision = decideReview(review);

        review.setStatus(decision.getStatus());
        productReviewRepository.save(review);

        return new ReviewModerationSimulationResult(
            review.getId(),
            moderator.getUsername(),
            previousStatus.name(),
            review.getStatus().name(),
            decision.getDecision(),
            decision.getExplanation()
        );
    }

    private ProductReview loadReview(Long reviewId) {
        return productReviewRepository.findById(reviewId)
            .orElseThrow(() -> new ResourceNotFoundException("Review '%s' was not found.".formatted(reviewId)));
    }

    private String normalize(String text) {
        if (text == null) {
            return "";
        }
        return text.toLowerCase(Locale.ROOT);
    }

    private void ensureModerator(AmazonUser moderator) {
        if (moderator == null) {
            throw new IllegalArgumentException("Moderator is required.");
        }
    }

    protected static final class ReviewModerationDecision {
        private final ReviewStatus status;
        private final String decision;
        private final String explanation;

        protected ReviewModerationDecision(ReviewStatus status, String decision, String explanation) {
            this.status = status;
            this.decision = decision;
            this.explanation = explanation;
        }

        protected ReviewStatus getStatus() {
            return status;
        }

        protected String getDecision() {
            return decision;
        }

        protected String getExplanation() {
            return explanation;
        }
    }
}
