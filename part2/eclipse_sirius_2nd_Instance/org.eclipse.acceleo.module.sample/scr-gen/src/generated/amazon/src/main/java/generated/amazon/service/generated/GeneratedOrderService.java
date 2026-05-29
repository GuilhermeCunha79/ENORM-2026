package generated.amazon.service.generated;

import generated.amazon.domain.Order;
import generated.amazon.repository.generated.GeneratedOrderRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedOrderService {
    protected final GeneratedOrderRepository repository;

    public GeneratedOrderService(GeneratedOrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public Order get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Order not found"));
    }

    public Order create(Order entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public Order update(String id, Order entity) {
        Order current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Order not found"));
        current.setDate(entity.getDate());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }
        repository.deleteById(id);
    }

}
