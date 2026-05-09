package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedOrder;

@Entity(name = "Order")
@Table(name = "orders")
public class Order extends GeneratedOrder {
}
