package pt.isep.enorm.ref.reddit.domain;

import pt.isep.enorm.ref.reddit.domain.generated.GeneratedCommentModerationCheck;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "commentModerationCheck")
public class CommentModerationCheck extends GeneratedCommentModerationCheck {
}
