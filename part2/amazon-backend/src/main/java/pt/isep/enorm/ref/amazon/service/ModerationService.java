package pt.isep.enorm.ref.amazon.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.domain.enums.ConditionOperator;
import pt.isep.enorm.ref.amazon.domain.enums.ModerationDecision;
import pt.isep.enorm.ref.amazon.domain.enums.ModerationMode;
import pt.isep.enorm.ref.amazon.domain.enums.ReviewStatus;
import pt.isep.enorm.ref.amazon.repository.ProductReviewRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedModerationModel;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedModerationModel.ActionSpec;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedModerationModel.ConditionSpec;
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
        String normalized = normalize(contentForCondition(review));
        for (ConditionSpec condition : GeneratedModerationModel.CONDITIONS) {
            if (condition.getOperator() != ConditionOperator.CONTAINS_KEYWORDS) {
                continue;
            }
            for (String keyword : condition.getValues()) {
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

        ActionSpec action = primaryAction();
        if (action != null) {
            return switch (action.getKind()) {
                case AUTO_APPROVE -> ReviewStatus.APPROVED;
                case AUTO_REJECT, REMOVE_CONTENT, BLOCK_SUBMISSION -> ReviewStatus.REJECTED;
                case FLAG_CONTENT, HIDE_CONTENT, DISPLAY_MESSAGE, NOTIFY_MODERATOR -> ReviewStatus.PENDING;
            };
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
            return "No " + conditionNames()
                + " match; " + GeneratedModerationModel.POLICY_NAME
                + " approved review from " + previousStatus + " to " + newStatus + ".";
        }

        ActionSpec action = primaryAction();
        String actionName = action == null ? "NoAction" : action.getName();
        String actionKind = action == null ? "NONE" : action.getKind().name();
        String actionMessage = action == null ? "" : "; message: " + action.getMessage();

        return GeneratedModerationModel.AUTOMATION_RULE_NAME
            + " (" + GeneratedModerationModel.AUTOMATION_TRIGGER + ") matched " + matches
            + "; " + actionName
            + " uses " + actionKind
            + "; " + GeneratedModerationModel.POLICY_NAME
            + " decision is " + decision
            + actionMessage
            + ".";
    }

    private ActionSpec primaryAction() {
        return GeneratedModerationModel.ACTIONS.isEmpty() ? null : GeneratedModerationModel.ACTIONS.get(0);
    }

    private String conditionNames() {
        return GeneratedModerationModel.CONDITIONS.stream()
            .map(ConditionSpec::getName)
            .toList()
            .toString();
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
