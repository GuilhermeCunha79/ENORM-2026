package pt.isep.enorm.ref.domain;

import pt.isep.enorm.ref.domain.generated.GeneratedOrderItem;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderItem")
public class OrderItem extends GeneratedOrderItem {
}
