package pt.isep.enorm.ref.amazon.web.dto;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UpdateCommentReviewRequest(
    @NotBlank @Size(max = 2000) String text,
    LocalDate createdAt,
    List<@Valid MediaReferenceRequest> mediaReferences
) {

    public UpdateCommentReviewRequest {
        text = text == null ? null : text.trim();
        mediaReferences = mediaReferences == null ? List.of() : List.copyOf(mediaReferences);
    }
}
