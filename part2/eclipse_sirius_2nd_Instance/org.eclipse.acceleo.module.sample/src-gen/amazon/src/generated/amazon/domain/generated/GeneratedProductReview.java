package generated.amazon.domain.generated;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class GeneratedProductReview  {
private Long id;
private Double rating;
private String text;
private LocalDate creationDate;
private Boolean verifiedPurchase;
private List<GeneratedMediaAttachment> mediaAttachments = new ArrayList<GeneratedMediaAttachment>();
private GeneratedVerificationProcess verificationProcess;
private List<GeneratedReviewModerationCheck> reviewModerationChecks = new ArrayList<GeneratedReviewModerationCheck>();
private List<GeneratedHelpfulVote> helpfulVotes = new ArrayList<GeneratedHelpfulVote>();
private GeneratedRatingPolicy ratingPolicy;
private GeneratedReviewPolicy reviewPolicy;
private GeneratedProduct product;
private GeneratedHelpfulVote helpfulVote;
}
