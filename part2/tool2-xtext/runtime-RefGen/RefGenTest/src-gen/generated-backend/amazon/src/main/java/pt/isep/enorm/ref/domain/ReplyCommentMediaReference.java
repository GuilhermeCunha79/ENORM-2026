package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedReplyCommentMediaReference;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "replycomment_media")
public class ReplyCommentMediaReference extends GeneratedReplyCommentMediaReference {
}
