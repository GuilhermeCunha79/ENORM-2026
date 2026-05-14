package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedCommentModerationCheck;

@Entity(name = "CommentModerationCheck")
@Table(name = "comment_moderation_checks")
public class CommentModerationCheck extends GeneratedCommentModerationCheck {
}

