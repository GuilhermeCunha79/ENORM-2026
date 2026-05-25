package generated.amazon.repository;

import generated.amazon.dto.ReviewPolicyDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewPolicyRepository {
    private final Map<String, ReviewPolicyDto> store = new LinkedHashMap<>();

    public List<ReviewPolicyDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<ReviewPolicyDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public ReviewPolicyDto save(ReviewPolicyDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
