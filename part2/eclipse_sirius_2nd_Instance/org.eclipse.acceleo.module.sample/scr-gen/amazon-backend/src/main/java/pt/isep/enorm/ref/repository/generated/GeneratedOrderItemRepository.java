package pt.isep.enorm.ref.repository.generated;

import pt.isep.enorm.ref.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedOrderItemRepository extends JpaRepository<OrderItem, Long> {
}
