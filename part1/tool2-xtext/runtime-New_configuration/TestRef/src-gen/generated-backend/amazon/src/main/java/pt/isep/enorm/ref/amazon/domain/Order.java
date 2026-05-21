package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedOrder;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "orders")
public class Order extends GeneratedOrder {
}
