package generated.amazon.repository;

import generated.amazon.dto.RatingPolicyDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class RatingPolicyRepository {
    private final Map<String, RatingPolicyDto> store = new LinkedHashMap<>();

    public List<RatingPolicyDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<RatingPolicyDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public RatingPolicyDto save(RatingPolicyDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
