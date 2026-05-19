package pt.isep.enorm.ref.amazon.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.domain.Order;
import pt.isep.enorm.ref.amazon.repository.OrderRepository;

@Service
public class GeneratedOrderService {
    private final OrderRepository repository;

    public GeneratedOrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Order not found: " + id));
    }

    public Order create(Order entity) {
        return repository.save(entity);
    }

    /** Override in manual OrderService for scenario-specific rules. */
    protected void beforeCreate(Order entity) {
    }
}
