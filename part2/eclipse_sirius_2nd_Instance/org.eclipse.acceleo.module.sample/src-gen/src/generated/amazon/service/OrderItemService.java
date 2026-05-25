package generated.amazon.service;

import generated.amazon.dto.OrderItemDto;
import generated.amazon.repository.OrderItemRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class OrderItemService {
    private final OrderItemRepository repository;

    public OrderItemService(OrderItemRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemDto> list() {
        return repository.findAll();
    }

    public OrderItemDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItem not found"));
    }

    public OrderItemDto create(OrderItemDto dto) {
        return repository.save(dto);
    }

    public OrderItemDto update(String id, OrderItemDto dto) {
        get(id);
        return repository.save(new OrderItemDto(id , dto.quantity()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
