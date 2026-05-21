package pt.isep.enorm.ref.reddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedPostreport;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "postreports")
public class Postreport extends GeneratedPostreport {
}
