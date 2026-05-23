package generated.amazon.runtime;

public final class RuleBodies {
private RuleBodies() {
}

public static final String REVIEWCONTENTCHECK_EXPRESSION = "Validate review text by normalizing content, checking risky keywords, and deciding whether to flag or approve the review body.";
public static final String REVIEWCONTENTCHECK_IMPLEMENTATION = "impl: let reviewText = lower(trim(attr_productReview_text)); let isRisky = containsAny(reviewText, ['spam','abuse','off-topic','incentivized']); if isRisky then create ReviewModerationCheck(reason='keyword-match', result='FLAGGED', timestamp=now()); set review.status='UNDER_REVIEW'; notify moderator with review id, buyer id, and matched terms; return WARNING; else set review.status='APPROVED'; return OK; end";
public static final String AUTOREVIEWCONTENTCHECK_FLAGSUSPICIOUSREVIEW_BODY = "impl: set review.status='UNDER_REVIEW'; create ReviewModerationCheck(reason='keyword-match', result='FLAGGED'); attach moderation timestamp; persist review for manual moderation queue.";
public static final String AUTOREVIEWCONTENTCHECK_NOTIFYMODERATOR_BODY = "impl: publish moderation event containing review id, product id, buyer id, normalized text, matched keywords, and creation timestamp to moderator inbox.";
}
