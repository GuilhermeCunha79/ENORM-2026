package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedCommentvote;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "commentvotes")
public class Commentvote extends GeneratedCommentvote {
}
