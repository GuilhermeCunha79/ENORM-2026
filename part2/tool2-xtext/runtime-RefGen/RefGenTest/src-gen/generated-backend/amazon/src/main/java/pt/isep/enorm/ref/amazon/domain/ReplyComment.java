package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedReplyComment;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "replycomments")
public class ReplyComment extends GeneratedReplyComment {
}
