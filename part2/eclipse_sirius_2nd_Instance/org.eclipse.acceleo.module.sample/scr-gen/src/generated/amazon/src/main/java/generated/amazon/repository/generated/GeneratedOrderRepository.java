package generated.amazon.repository.generated;

import generated.amazon.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedOrderRepository extends JpaRepository<Order, String> {
}
