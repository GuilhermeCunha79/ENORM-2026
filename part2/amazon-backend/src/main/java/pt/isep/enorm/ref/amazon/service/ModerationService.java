package pt.isep.enorm.ref.amazon.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.domain.enums.ModerationDecision;
import pt.isep.enorm.ref.amazon.domain.enums.ModerationMode;
import pt.isep.enorm.ref.amazon.domain.enums.ReviewStatus;
import pt.isep.enorm.ref.amazon.repository.ProductReviewRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedModerationModel;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedModerationService;
import pt.isep.enorm.ref.amazon.service.projection.ModerationSimulationResult;
import pt.isep.enorm.ref.amazon.web.error.ResourceNotFoundException;

@Service
public class ModerationService extends GeneratedModerationService {

    private final ProductReviewRepository productReviewRepository;

    public ModerationService(ProductReviewRepository productReviewRepository) {
        super(productReviewRepository);
        this.productReviewRepository = productReviewRepository;
    }

    @Transactional
    public ModerationSimulationResult simulateReviewModeration(AmazonUser moderator, Long reviewId) {
        ensureModerator(moderator);
        ProductReview review = loadReview(reviewId);

        if (!isPolicyTriggerMatched(review)) {
            return skipped(review);
        }

        return moderateReview(review);
    }

    @Transactional
    public List<ModerationSimulationResult> simulatePendingReviewModeration(AmazonUser moderator) {
        ensureModerator(moderator);
        List<ModerationSimulationResult> results = new ArrayList<>();

        for (ProductReview review : productReviewRepository.findByStatus(ReviewStatus.PENDING)) {
            results.add(moderateReview(review));
        }

        return results;
    }

    private ModerationSimulationResult moderateReview(ProductReview review) {
        ReviewStatus previousStatus = review.getStatus();
        List<String> matches = findMatchedKeywords(review);
        ModerationDecision decision = matches.isEmpty()
            ? ModerationDecision.APPROVED
            : GeneratedModerationModel.POLICY_DECISION;
        ReviewStatus status = statusFor(decision);

        review.setStatus(status);
        productReviewRepository.save(review);

        return result(
            review,
            decision.name(),
            status,
            matches,
            explanation(previousStatus, status, matches, decision)
        );
    }

    private boolean isPolicyTriggerMatched(ProductReview review) {
        if (GeneratedModerationModel.POLICY_TRIGGER.name().equals("ON_REPORT_THRESHOLD")) {
            return review.getStatus() == ReviewStatus.PENDING;
        }
        return true;
    }

    private List<String> findMatchedKeywords(ProductReview review) {
        List<String> matches = new ArrayList<>();
        if (GeneratedModerationModel.CONDITION_OPERATOR.name().equals("CONTAINS_KEYWORDS")) {
            String normalized = normalize(contentForCondition(review));
            for (String keyword : GeneratedModerationModel.BLOCKED_KEYWORDS) {
                if (normalized.contains(keyword.toLowerCase(Locale.ROOT))) {
                    matches.add(keyword);
                }
            }
        }
        return matches;
    }

    private String contentForCondition(ProductReview review) {
        return review.getComment();
    }

    private ReviewStatus statusFor(ModerationDecision decision) {
        if (decision == ModerationDecision.APPROVED) {
            return ReviewStatus.APPROVED;
        }

        if (GeneratedModerationModel.POLICY_MODE == ModerationMode.MANUAL) {
            return ReviewStatus.PENDING;
        }

        if (decision == ModerationDecision.FLAGGED) {
            return ReviewStatus.PENDING;
        }

        return ReviewStatus.REJECTED;
    }

    private String explanation(
        ReviewStatus previousStatus,
        ReviewStatus newStatus,
        List<String> matches,
        ModerationDecision decision
    ) {
        if (matches.isEmpty()) {
            return "No " + GeneratedModerationModel.CONDITION_NAME
                + " match; " + GeneratedModerationModel.POLICY_NAME
                + " approved review from " + previousStatus + " to " + newStatus + ".";
        }

        return GeneratedModerationModel.AUTOMATION_RULE_NAME
            + " (" + GeneratedModerationModel.AUTOMATION_TRIGGER + ") matched " + matches
            + "; " + GeneratedModerationModel.ACTION_NAME
            + " uses " + GeneratedModerationModel.ACTION_KIND
            + "; " + GeneratedModerationModel.POLICY_NAME
            + " decision is " + decision
            + ".";
    }

    private ModerationSimulationResult skipped(ProductReview review) {
        return result(
            review,
            "SKIPPED",
            review.getStatus(),
            List.of(),
            GeneratedModerationModel.POLICY_NAME + " skipped because "
                + GeneratedModerationModel.POLICY_TRIGGER + " did not match."
        );
    }

    private ModerationSimulationResult result(
        ProductReview review,
        String decision,
        ReviewStatus status,
        List<String> matches,
        String explanation
    ) {
        return new ModerationSimulationResult(
            "REVIEW",
            review.getId(),
            null,
            null,
            GeneratedModerationModel.POLICY_TRIGGER.name(),
            GeneratedModerationModel.POLICY_MODE.name(),
            decision,
            status.name(),
            matches,
            explanation
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
        if (moderator.getRole() != GeneratedModerationModel.POLICY_EXECUTED_BY) {
            throw new IllegalArgumentException("Moderation policy requires " + GeneratedModerationModel.POLICY_EXECUTED_BY + ".");
        }
    }
}
