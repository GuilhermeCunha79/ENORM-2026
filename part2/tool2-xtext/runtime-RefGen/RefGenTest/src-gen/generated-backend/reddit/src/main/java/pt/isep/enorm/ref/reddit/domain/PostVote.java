package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedPostVote;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "postvotes")
public class PostVote extends GeneratedPostVote {
}
