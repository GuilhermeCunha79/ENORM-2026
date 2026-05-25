package generated.amazon.repository;

import generated.amazon.dto.ReviewModerationCheckDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewModerationCheckRepository {
    private final Map<String, ReviewModerationCheckDto> store = new LinkedHashMap<>();

    public List<ReviewModerationCheckDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<ReviewModerationCheckDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public ReviewModerationCheckDto save(ReviewModerationCheckDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
