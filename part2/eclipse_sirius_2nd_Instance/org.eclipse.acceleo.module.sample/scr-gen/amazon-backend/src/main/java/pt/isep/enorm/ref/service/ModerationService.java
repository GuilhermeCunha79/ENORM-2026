package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.service.generated.GeneratedModerationService;
import pt.isep.enorm.ref.domain.UserType;
import pt.isep.enorm.ref.domain.ProductReview;
import pt.isep.enorm.ref.domain.enums.ModerationDecision;
import pt.isep.enorm.ref.repository.ProductReviewRepository;
import pt.isep.enorm.ref.service.generated.GeneratedModerationModel;
import pt.isep.enorm.ref.service.generated.GeneratedModerationModel.AutomationRuleSpec;
import pt.isep.enorm.ref.service.generated.GeneratedModerationModel.ConditionSpec;
import pt.isep.enorm.ref.service.generated.GeneratedModerationModel.PolicySpec;
import pt.isep.enorm.ref.service.projection.ModerationSimulationResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ModerationService extends GeneratedModerationService {
    private final ProductReviewRepository productReviewRepository;

    public ModerationService(ProductReviewRepository productReviewRepository) {
        super();
        this.productReviewRepository = productReviewRepository;
    }

    @Transactional
    public void approveReview(UserType moderator, Long reviewId) {
        ProductReview review = loadReview(reviewId);
        review.setStatus(ModerationDecision.APPROVED);
        productReviewRepository.save(review);
    }

    @Transactional
    public ModerationSimulationResult simulateReviewModeration(UserType moderator, Long reviewId) {
        return moderateReview(loadReview(reviewId), GeneratedModerationModel.DEFAULT_POLICY);
    }

    @Transactional
    public List<ModerationSimulationResult> simulatePendingReviewModeration(UserType moderator) {
        List<ModerationSimulationResult> results = new ArrayList<>();
        PolicySpec policy = policyForReportThreshold();
        for (ProductReview review : productReviewRepository.findByStatus(ModerationDecision.FLAGGED)) {
            results.add(moderateReview(review, policy));
        }
        return results;
    }

    @Transactional
    public void moderateAutomaticallyOnReviewCreated(ProductReview review) {
        if (review != null) {
            moderateReview(review, GeneratedModerationModel.DEFAULT_POLICY);
        }
    }

    private ModerationSimulationResult moderateReview(ProductReview review, PolicySpec policy) {
        AutomationRuleSpec rule = primaryRule(policy);
        List<String> matches = matchedKeywords(review.getComment(), rule);
        String decision = matches.isEmpty() ? "APPROVED" : policy.getDecision().name();
        ModerationDecision status = matches.isEmpty() ? ModerationDecision.APPROVED : ModerationDecision.FLAGGED;
        review.setStatus(status);
        productReviewRepository.save(review);
        return new ModerationSimulationResult("REVIEW", review.getId(), null, null, policy.getTrigger().name(), policy.getMode().name(), decision, status.name(), matches, explanation(policy, rule, matches));
    }

    private PolicySpec policyForReportThreshold() {
        return GeneratedModerationModel.POLICIES.stream()
            .filter(policy -> "ON_REPORT_THRESHOLD".equals(policy.getTrigger().name()))
            .findFirst()
            .orElse(GeneratedModerationModel.DEFAULT_POLICY);
    }

    private AutomationRuleSpec primaryRule(PolicySpec policy) {
        return policy.getAutomationRules().isEmpty() ? null : policy.getAutomationRules().get(0);
    }

    private List<String> matchedKeywords(String text, AutomationRuleSpec rule) {
        String normalized = text == null ? "" : text.toLowerCase(Locale.ROOT);
        List<String> matches = new ArrayList<>();
        if (rule == null) {
            return matches;
        }
        for (ConditionSpec condition : rule.getConditions()) {
            if (!"CONTAINS_KEYWORDS".equals(condition.getOperator().name())) {
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

    private String explanation(PolicySpec policy, AutomationRuleSpec rule, List<String> matches) {
        if (matches.isEmpty()) {
            return "No generated keyword condition matched; " + policy.getName() + " approved review.";
        }
        return (rule == null ? "NoAutomationRule" : rule.getName()) + " matched " + matches + "; " + policy.getName() + " flagged review for moderation.";
    }

    private ProductReview loadReview(Long reviewId) {
        return productReviewRepository.findById(reviewId).orElseThrow();
    }

}
