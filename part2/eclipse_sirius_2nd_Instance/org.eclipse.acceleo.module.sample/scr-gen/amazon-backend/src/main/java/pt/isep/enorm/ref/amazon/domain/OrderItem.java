package pt.isep.enorm.ref.amazon.domain;

import pt.isep.enorm.ref.amazon.domain.generated.GeneratedOrderItem;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderItem")
public class OrderItem extends GeneratedOrderItem {
}
