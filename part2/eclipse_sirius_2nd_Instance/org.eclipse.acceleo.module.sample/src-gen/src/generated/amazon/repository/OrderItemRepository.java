package generated.amazon.repository;

import generated.amazon.dto.OrderItemDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class OrderItemRepository {
    private final Map<String, OrderItemDto> store = new LinkedHashMap<>();

    public List<OrderItemDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<OrderItemDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public OrderItemDto save(OrderItemDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
