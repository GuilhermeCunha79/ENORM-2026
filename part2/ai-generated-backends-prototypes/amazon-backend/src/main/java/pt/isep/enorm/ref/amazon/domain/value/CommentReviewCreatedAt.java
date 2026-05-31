package pt.isep.enorm.ref.amazon.domain.value;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class CommentReviewCreatedAt {

    @Column(name = "comment_created_at", nullable = false)
    private LocalDate value;

    protected CommentReviewCreatedAt() {
    }

    public CommentReviewCreatedAt(LocalDate value) {
        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }

    public void setValue(LocalDate value) {
        this.value = value;
    }
}
