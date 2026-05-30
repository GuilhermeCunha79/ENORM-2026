package pt.isep.enorm.ref.youtube.domain;

import pt.isep.enorm.ref.youtube.domain.generated.GeneratedComment;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment extends GeneratedComment {
}
