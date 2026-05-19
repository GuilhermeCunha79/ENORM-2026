package pt.isep.enorm.ref.amazonscenario.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazonscenario.domain.generated.GeneratedProductcomment;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "productcomments")
public class Productcomment extends GeneratedProductcomment {
}
