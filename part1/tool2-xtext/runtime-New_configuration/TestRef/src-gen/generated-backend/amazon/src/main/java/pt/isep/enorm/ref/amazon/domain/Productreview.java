package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedProductreview;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "productreviews")
public class Productreview extends GeneratedProductreview {
}
