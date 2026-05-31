package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedCommentMediaReference;

@Entity(name = "CommentMediaReference")
@Table(name = "comment_media_references")
public class CommentMediaReference extends GeneratedCommentMediaReference {
}
