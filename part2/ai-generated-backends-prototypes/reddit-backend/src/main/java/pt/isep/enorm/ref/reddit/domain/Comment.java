package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedComment;

@Entity(name = "Comment")
@Table(name = "comments")
public class Comment extends GeneratedComment {
}

