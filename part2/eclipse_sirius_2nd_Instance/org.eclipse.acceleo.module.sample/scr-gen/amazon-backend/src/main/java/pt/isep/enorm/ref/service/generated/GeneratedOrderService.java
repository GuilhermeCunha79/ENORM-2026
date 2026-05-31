package pt.isep.enorm.ref.service.generated;

import pt.isep.enorm.ref.domain.Order;
import pt.isep.enorm.ref.repository.generated.GeneratedOrderRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GeneratedOrderService {
    protected final GeneratedOrderRepository repository;

    public GeneratedOrderService(GeneratedOrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> list() {
        return repository.findAll();
    }

    public Order get(String id) {
        return repository.findById(toLong(id))
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Order '" + id + "' was not found."));
    }

    public Order create(Order entity) {
        return repository.save(entity);
    }

    public Order update(String id, Order entity) {
        entity.setId(toLong(id));
        return repository.save(entity);
    }

    public void delete(String id) {
        repository.deleteById(toLong(id));
    }

    private Long toLong(String id) {
        try {
            return Long.valueOf(id);
        } catch (NumberFormatException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid numeric id: " + id);
        }
    }
}
