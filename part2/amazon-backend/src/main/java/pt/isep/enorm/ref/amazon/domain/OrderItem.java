package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedOrderItem;

@Entity(name = "OrderItem")
@Table(name = "order_items")
public class OrderItem extends GeneratedOrderItem {
}
