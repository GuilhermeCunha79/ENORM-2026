package pt.isep.enorm.ref.amazon.web.dto;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CreateCommentReviewRequest(
    String commentCode,
    @NotBlank @Size(max = 2000) String text,
    LocalDate createdAt,
    @NotNull Long productId,
    List<@Valid MediaReferenceRequest> mediaReferences
) {

    public CreateCommentReviewRequest {
        text = text == null ? null : text.trim();
        mediaReferences = mediaReferences == null ? List.of() : List.copyOf(mediaReferences);
    }
}
