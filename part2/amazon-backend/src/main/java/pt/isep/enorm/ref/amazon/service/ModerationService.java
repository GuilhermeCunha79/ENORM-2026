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
import pt.isep.enorm.ref.amazon.domain.enums.TriggerEvent;
import pt.isep.enorm.ref.amazon.repository.ProductReviewRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedModerationModel;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedModerationModel.ActionSpec;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedModerationModel.AutomationRuleSpec;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedModerationModel.ConditionSpec;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedModerationModel.PolicySpec;
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
        PolicySpec policy = policyFor("ProductReview", TriggerEvent.ON_FEEDBACK_CREATE);

        if (policy == null || !isPolicyTriggerMatched(policy, review)) {
            return skipped(review, policy, TriggerEvent.ON_FEEDBACK_CREATE);
        }

        return moderateReview(review, policy);
    }

    @Transactional
    public List<ModerationSimulationResult> simulatePendingReviewModeration(AmazonUser moderator) {
        ensureModerator(moderator);
        List<ModerationSimulationResult> results = new ArrayList<>();
        PolicySpec policy = policyFor("ProductReview", TriggerEvent.ON_REPORT_THRESHOLD);

        for (ProductReview review : productReviewRepository.findByStatus(ReviewStatus.PENDING)) {
            if (policy == null || !isPolicyTriggerMatched(policy, review)) {
                results.add(skipped(review, policy, TriggerEvent.ON_REPORT_THRESHOLD));
            } else {
                results.add(moderateReview(review, policy));
            }
        }

        return results;
    }

    private ModerationSimulationResult moderateReview(ProductReview review, PolicySpec policy) {
        AutomationRuleSpec rule = primaryRule(policy);
        ReviewStatus previousStatus = review.getStatus();
        List<String> matches = findMatchedKeywords(review, rule);
        ModerationDecision decision = matches.isEmpty()
            ? ModerationDecision.APPROVED
            : policy.getDecision();
        ReviewStatus status = statusFor(decision, policy, rule);

        review.setStatus(status);
        productReviewRepository.save(review);

        return result(
            review,
            decision.name(),
            status,
            matches,
            explanation(previousStatus, status, matches, decision, policy, rule),
            policy
        );
    }

    private boolean isPolicyTriggerMatched(PolicySpec policy, ProductReview review) {
        if (policy.getTrigger() == TriggerEvent.ON_REPORT_THRESHOLD) {
            return review.getStatus() == ReviewStatus.PENDING;
        }
        return true;
    }

    private List<String> findMatchedKeywords(ProductReview review, AutomationRuleSpec rule) {
        List<String> matches = new ArrayList<>();
        if (rule == null) {
            return matches;
        }
        String normalized = normalize(contentForCondition(review));
        for (ConditionSpec condition : rule.getConditions()) {
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

    private ReviewStatus statusFor(ModerationDecision decision, PolicySpec policy, AutomationRuleSpec rule) {
        if (decision == ModerationDecision.APPROVED) {
            return ReviewStatus.APPROVED;
        }

        ActionSpec action = primaryAction(rule);
        if (action != null) {
            return switch (action.getKind()) {
                case AUTO_APPROVE -> ReviewStatus.APPROVED;
                case AUTO_REJECT, REMOVE_CONTENT, BLOCK_SUBMISSION -> ReviewStatus.REJECTED;
                case FLAG_CONTENT, HIDE_CONTENT, DISPLAY_MESSAGE, NOTIFY_MODERATOR -> ReviewStatus.PENDING;
            };
        }

        if (policy.getMode() == ModerationMode.MANUAL) {
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
        ModerationDecision decision,
        PolicySpec policy,
        AutomationRuleSpec rule
    ) {
        if (matches.isEmpty()) {
            return "No " + conditionNames(rule)
                + " match; " + policy.getName()
                + " approved review from " + previousStatus + " to " + newStatus + ".";
        }

        ActionSpec action = primaryAction(rule);
        String actionName = action == null ? "NoAction" : action.getName();
        String actionKind = action == null ? "NONE" : action.getKind().name();
        String actionMessage = action == null ? "" : "; message: " + action.getMessage();

        return ruleName(rule)
            + " (" + ruleTrigger(rule) + ") matched " + matches
            + "; " + actionName
            + " uses " + actionKind
            + "; " + policy.getName()
            + " decision is " + decision
            + actionMessage
            + ".";
    }

    private PolicySpec policyFor(String targetType, TriggerEvent trigger) {
        return GeneratedModerationModel.POLICIES.stream()
            .filter(policy -> policy.getTrigger() == trigger)
            .filter(policy -> targetMatches(policy, targetType))
            .findFirst()
            .orElse(null);
    }

    private boolean targetMatches(PolicySpec policy, String targetType) {
        if (targetType == null || targetType.isBlank()) {
            return true;
        }
        return targetType.equals(policy.getResourceTarget()) || targetType.equals(policy.getFeedbackTarget());
    }

    private AutomationRuleSpec primaryRule(PolicySpec policy) {
        if (policy == null || policy.getAutomationRules().isEmpty()) {
            return null;
        }
        return policy.getAutomationRules().get(0);
    }

    private ActionSpec primaryAction(AutomationRuleSpec rule) {
        return rule == null || rule.getActions().isEmpty() ? null : rule.getActions().get(0);
    }

    private String conditionNames(AutomationRuleSpec rule) {
        if (rule == null) {
            return "[]";
        }
        return rule.getConditions().stream()
            .map(ConditionSpec::getName)
            .toList()
            .toString();
    }

    private String ruleName(AutomationRuleSpec rule) {
        return rule == null ? "NoAutomationRule" : rule.getName();
    }

    private String ruleTrigger(AutomationRuleSpec rule) {
        return rule == null ? "NONE" : rule.getTrigger().name();
    }

    private ModerationSimulationResult skipped(ProductReview review, PolicySpec policy, TriggerEvent requestedTrigger) {
        return result(
            review,
            "SKIPPED",
            review.getStatus(),
            List.of(),
            (policy == null ? "No generated policy" : policy.getName()) + " skipped because "
                + requestedTrigger + " did not match.",
            policy
        );
    }

    private ModerationSimulationResult result(
        ProductReview review,
        String decision,
        ReviewStatus status,
        List<String> matches,
        String explanation,
        PolicySpec policy
    ) {
        PolicySpec resultPolicy = policy == null ? GeneratedModerationModel.DEFAULT_POLICY : policy;
        return new ModerationSimulationResult(
            "REVIEW",
            review.getId(),
            null,
            null,
            resultPolicy.getTrigger().name(),
            resultPolicy.getMode().name(),
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
        boolean allowed = GeneratedModerationModel.POLICIES.stream()
            .anyMatch(policy -> policy.getExecutedByKind() != null
                && policy.getExecutedByKind().name().equalsIgnoreCase(moderator.getRole().name()));
        if (!allowed) {
            throw new IllegalArgumentException("Moderation policies require MODERATOR.");
        }
    }
}
