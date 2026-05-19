package pt.isep.enorm.ref.amazonscenario.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazonscenario.domain.generated.GeneratedProduct;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "products")
public class Product extends GeneratedProduct {
}
