package generated.amazon.repository;

import generated.amazon.dto.OrderDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    private final Map<String, OrderDto> store = new LinkedHashMap<>();

    public List<OrderDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<OrderDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public OrderDto save(OrderDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
