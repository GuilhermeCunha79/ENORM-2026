package pt.isep.enorm.ref.domain;

import pt.isep.enorm.ref.domain.generated.GeneratedOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order extends GeneratedOrder {
}
