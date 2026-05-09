package pt.isep.enorm.ref.amazon.web.dto;

import java.time.LocalDate;
import java.util.List;

public record CommentReviewResponse(
    Long id,
    String commentCode,
    String text,
    LocalDate createdAt,
    Long productId,
    List<MediaReferenceResponse> mediaReferences
) {

    public CommentReviewResponse {
        mediaReferences = mediaReferences == null ? List.of() : List.copyOf(mediaReferences);
    }
}
