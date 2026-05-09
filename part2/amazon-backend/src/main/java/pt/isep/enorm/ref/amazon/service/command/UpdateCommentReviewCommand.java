package pt.isep.enorm.ref.amazon.service.command;

import java.time.LocalDate;
import java.util.List;

public record UpdateCommentReviewCommand(String text, LocalDate createdAt, List<MediaReferenceCommand> mediaReferences) {
}
