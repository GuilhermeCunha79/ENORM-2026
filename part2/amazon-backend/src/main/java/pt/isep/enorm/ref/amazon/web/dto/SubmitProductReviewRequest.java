package pt.isep.enorm.ref.amazon.web.dto;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record SubmitProductReviewRequest(
    @NotBlank @Size(max = 2000) String comment,
    @NotNull @Min(1) @Max(5) Integer grade,
    @NotNull @Valid ProductReferenceRequest product,
    List<@Valid MediaReferenceRequest> mediaReferences
) {

    public SubmitProductReviewRequest {
        comment = comment == null ? null : comment.trim();
        mediaReferences = mediaReferences == null ? List.of() : List.copyOf(mediaReferences);
    }
}