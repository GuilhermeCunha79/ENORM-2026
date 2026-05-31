package pt.isep.enorm.ref.amazon.domain.value;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class CommentReviewText {

    @Column(name = "comment_text", nullable = false, length = 2000)
    private String value;

    protected CommentReviewText() {
    }

    public CommentReviewText(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
