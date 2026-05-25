package generated.amazon.service;

import generated.amazon.dto.OrderDto;
import generated.amazon.repository.OrderRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<OrderDto> list() {
        return repository.findAll();
    }

    public OrderDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Order not found"));
    }

    public OrderDto create(OrderDto dto) {
        return repository.save(dto);
    }

    public OrderDto update(String id, OrderDto dto) {
        get(id);
        return repository.save(new OrderDto(id , dto.date()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
