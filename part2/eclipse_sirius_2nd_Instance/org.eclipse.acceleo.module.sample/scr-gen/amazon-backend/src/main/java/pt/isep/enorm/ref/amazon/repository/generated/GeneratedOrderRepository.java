package pt.isep.enorm.ref.amazon.repository.generated;

import pt.isep.enorm.ref.amazon.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedOrderRepository extends JpaRepository<Order, Long> {
}
