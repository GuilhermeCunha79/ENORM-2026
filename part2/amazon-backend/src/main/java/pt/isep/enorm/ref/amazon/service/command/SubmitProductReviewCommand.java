package pt.isep.enorm.ref.amazon.service.command;

import java.util.List;
import java.util.Objects;

public record SubmitProductReviewCommand(String comment, int grade, Long productId, List<MediaReferenceCommand> mediaReferences) {

    public SubmitProductReviewCommand {
        comment = Objects.requireNonNull(comment, "comment is required").trim();
        productId = Objects.requireNonNull(productId, "productId is required");
        mediaReferences = mediaReferences == null ? List.of() : List.copyOf(mediaReferences);
    }
}