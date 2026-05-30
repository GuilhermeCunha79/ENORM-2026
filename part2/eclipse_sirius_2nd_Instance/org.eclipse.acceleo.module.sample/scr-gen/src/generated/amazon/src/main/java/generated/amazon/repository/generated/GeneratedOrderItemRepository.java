package generated.amazon.repository.generated;

import generated.amazon.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedOrderItemRepository extends JpaRepository<OrderItem, String> {
}
