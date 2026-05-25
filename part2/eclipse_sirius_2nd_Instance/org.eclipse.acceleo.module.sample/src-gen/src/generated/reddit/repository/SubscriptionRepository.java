package generated.reddit.repository;

import generated.reddit.dto.SubscriptionDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class SubscriptionRepository {
    private final Map<String, SubscriptionDto> store = new LinkedHashMap<>();

    public List<SubscriptionDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<SubscriptionDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public SubscriptionDto save(SubscriptionDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
