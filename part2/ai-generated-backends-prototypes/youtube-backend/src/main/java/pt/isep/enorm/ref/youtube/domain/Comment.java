package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedComment;

@Entity(name = "Comment")
@Table(name = "comments")
public class Comment extends GeneratedComment {
}

