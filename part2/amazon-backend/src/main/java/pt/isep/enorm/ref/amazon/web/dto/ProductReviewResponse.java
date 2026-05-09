package pt.isep.enorm.ref.amazon.web.dto;

import java.util.List;

import pt.isep.enorm.ref.amazon.domain.enums.ReviewStatus;
import pt.isep.enorm.ref.amazon.domain.enums.VerificationType;

public record ProductReviewResponse(
    Long id,
    String comment,
    int grade,
    ReviewStatus status,
    VerificationType verificationType,
    boolean verifiedBuyerAtSubmission,
    ProductResponse product,
    List<MediaReferenceResponse> mediaReferences
) {

    public ProductReviewResponse {
        mediaReferences = mediaReferences == null ? List.of() : List.copyOf(mediaReferences);
    }
}
