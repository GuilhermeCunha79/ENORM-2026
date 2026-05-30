package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedPostReport;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "postreports")
public class PostReport extends GeneratedPostReport {
}
