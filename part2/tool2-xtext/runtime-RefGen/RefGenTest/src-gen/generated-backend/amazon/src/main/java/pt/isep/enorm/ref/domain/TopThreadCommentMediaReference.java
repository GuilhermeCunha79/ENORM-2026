package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedTopThreadCommentMediaReference;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "topthreadcomment_media")
public class TopThreadCommentMediaReference extends GeneratedTopThreadCommentMediaReference {
}
