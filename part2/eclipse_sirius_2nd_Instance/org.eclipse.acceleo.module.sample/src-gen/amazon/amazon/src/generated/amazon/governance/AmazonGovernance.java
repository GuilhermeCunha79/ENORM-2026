package generated.amazon.governance;

import java.util.List;

public final class AmazonGovernance {

    public record AuthorizationSpec(
        String name,
        String allowedAction,
        String actor,
        String context,
        String resourceTarget,
        String feedbackTarget
    ) {}

    public record ValidationSpec(
        String name,
        String kind,
        String severity,
        String expression,
        String implementationBody,
        String appliesToResource,
        String appliesToFeedback,
        String invokedBy
    ) {}

    public record ModerationPolicySpec(
        String name,
        String mode,
        String trigger,
        String decision,
        String monitorsResource,
        String monitorsFeedback,
        List<String> executedBy,
        String inContext
    ) {}

    public record ConditionSpec(
        String name,
        String operator,
        String attribute,
        List<String> values
    ) {}

    public record ActionSpec(
        String name,
        String kind,
        String implementationBody
    ) {}

    public record AutomationSpec(
        String name,
        String trigger,
        String contextResource,
        String inContext,
        String onFeedback,
        String usesValidation,
        List<ConditionSpec> conditions,
        List<ActionSpec> actions
    ) {}

    public record VerificationPolicySpec(
        String name,
        String mode,
        String appliesWhen,
        String verifies
    ) {}

    public record SortingPolicySpec(
        String name,
        String criterion,
        String direction,
        String appliesToResource,
        String appliesToFeedback,
        String inContext
    ) {}

    public List<AuthorizationSpec> authorizations() {
        return List.of(
new AuthorizationSpec(
                "BuyerReadProduct",
                "READ",
                "Buyer",
                "AmazonCatalog",
                "Product",
                null
            ),
            new AuthorizationSpec(
                "BuyerCreateProductReview",
                "CREATE",
                "Buyer",
                "AmazonCatalog",
                "Product",
                "ProductReview"
            ),
            new AuthorizationSpec(
                "UserVoteHelpful",
                "VOTE",
                "User",
                "AmazonCatalog",
                "Product",
                "HelpfulVoteOnReview"
            ),
            new AuthorizationSpec(
                "ModeratorModerateReview",
                "MODERATE",
                "Moderator",
                "ModerationBackoffice",
                "Product",
                "ProductReview"
            )        );
    }

    public List<ValidationSpec> validations() {
        return List.of(
new ValidationSpec(
                "ReviewContentCheck",
                "AUTOMATIC",
                "WARNING",
                """
Validate review text by normalizing content, checking risky keywords, and deciding whether to flag or approve the review body.
                """,
                """
impl: let reviewText = lower(trim(attr_productReview_text)); let isRisky = containsAny(reviewText, ['spam','abuse','off-topic','incentivized']); if isRisky then create ReviewModerationCheck(reason='keyword-match', result='FLAGGED', timestamp=now()); set review.status='UNDER_REVIEW'; notify moderator with review id, buyer id, and matched terms; return WARNING; else set review.status='APPROVED'; return OK; end
                """,
                null,
                "ProductReview",
                "AutoReviewContentCheck"
            )        );
    }

    public List<ModerationPolicySpec> moderationPolicies() {
        return List.of(
new ModerationPolicySpec(
                "ReviewModerationOnCreate",
                "HYBRID",
                "ON_FEEDBACK_CREATE",
                "FLAGGED",
                "Product",
                "ProductReview",
                List.of("Moderator"),
                "ModerationBackoffice"
            )        );
    }

    public List<AutomationSpec> automations() {
        return List.of(
new AutomationSpec(
                "AutoReviewContentCheck",
                "ON_FEEDBACK_CREATE",
                "Product",
                "AmazonCatalog",
                "ProductReview",
                "ReviewContentCheck",
                List.of(
new ConditionSpec(
                        "ReviewTextKeywordScreening",
                        "CONTAINS_KEYWORDS",
                        "text",
                        List.of("spam", "abuse", "off-topic", "incentivized")
                    )                ),
                List.of(
new ActionSpec(
                        "FlagSuspiciousReview",
                        "FLAG_CONTENT",
                        """
impl: set review.status='UNDER_REVIEW'; create ReviewModerationCheck(reason='keyword-match', result='FLAGGED'); attach moderation timestamp; persist review for manual moderation queue.
                        """
                    ),
                    new ActionSpec(
                        "NotifyModerator",
                        "NOTIFY_MODERATOR",
                        """
impl: publish moderation event containing review id, product id, buyer id, normalized text, matched keywords, and creation timestamp to moderator inbox.
                        """
                    )                )
            )        );
    }

    public List<VerificationPolicySpec> verificationPolicies() {
        return List.of(
new VerificationPolicySpec(
                "VerifiedPurchaseCheck",
                "AUTOMATIC",
                "ON_FEEDBACK_CREATE",
                "ProductReview"
            )        );
    }

    public List<SortingPolicySpec> sortingPolicies() {
        return List.of(
new SortingPolicySpec(
                "NewestReviews",
                "DATE",
                "DESC",
                null,
                "ProductReview",
                "AmazonCatalog"
            ),
            new SortingPolicySpec(
                "MostRelevantReviews",
                "RELEVANCE",
                "DESC",
                null,
                "ProductReview",
                "AmazonCatalog"
            )        );
    }
}
