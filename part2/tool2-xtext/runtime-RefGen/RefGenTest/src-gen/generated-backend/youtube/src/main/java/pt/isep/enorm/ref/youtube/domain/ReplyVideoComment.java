package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedReplyVideoComment;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "replyvideocomments")
public class ReplyVideoComment extends GeneratedReplyVideoComment {
}
