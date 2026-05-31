package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedHelpfulVote;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "helpfulvotes")
public class HelpfulVote extends GeneratedHelpfulVote {
}
