package pt.isep.enorm.ref.amazon.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.amazon.domain.Order;

@NoRepositoryBean
public interface GeneratedOrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByBuyerId(Long buyerId);
}
