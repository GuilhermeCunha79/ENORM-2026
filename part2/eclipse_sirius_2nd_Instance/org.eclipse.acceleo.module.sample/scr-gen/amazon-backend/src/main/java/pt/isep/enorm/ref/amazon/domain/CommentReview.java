package pt.isep.enorm.ref.amazon.domain;

import pt.isep.enorm.ref.amazon.domain.generated.GeneratedCommentReview;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "commentReview")
public class CommentReview extends GeneratedCommentReview {
}
