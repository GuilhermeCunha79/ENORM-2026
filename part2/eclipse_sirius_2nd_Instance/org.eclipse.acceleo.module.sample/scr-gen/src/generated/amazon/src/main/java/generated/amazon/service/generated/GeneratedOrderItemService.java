package generated.amazon.service.generated;

import generated.amazon.domain.OrderItem;
import generated.amazon.repository.generated.GeneratedOrderItemRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedOrderItemService {
    protected final GeneratedOrderItemRepository repository;

    public GeneratedOrderItemService(GeneratedOrderItemRepository repository) {
        this.repository = repository;
    }

    public List<OrderItem> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public OrderItem get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItem not found"));
    }

    public OrderItem create(OrderItem entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public OrderItem update(String id, OrderItem entity) {
        OrderItem current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItem not found"));
        current.setQuantity(entity.getQuantity());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItem not found");
        }
        repository.deleteById(id);
    }

}
