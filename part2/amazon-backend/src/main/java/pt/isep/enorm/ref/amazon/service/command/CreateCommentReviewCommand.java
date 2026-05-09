package pt.isep.enorm.ref.amazon.service.command;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public record CreateCommentReviewCommand(
    String commentCode,
    String text,
    LocalDate createdAt,
    Long productId,
    List<MediaReferenceCommand> mediaReferences
) {

    public CreateCommentReviewCommand {
        text = Objects.requireNonNull(text, "text is required").trim();
        productId = Objects.requireNonNull(productId, "productId is required");
        mediaReferences = mediaReferences == null ? List.of() : List.copyOf(mediaReferences);
    }
}
