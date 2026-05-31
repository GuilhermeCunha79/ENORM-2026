package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedCommentReview;

@Entity(name = "CommentReview")
@Table(name = "comment_reviews")
public class CommentReview extends GeneratedCommentReview {
}
