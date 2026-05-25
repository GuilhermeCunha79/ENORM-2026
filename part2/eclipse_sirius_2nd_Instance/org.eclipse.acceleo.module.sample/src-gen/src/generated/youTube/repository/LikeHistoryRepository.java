package generated.youTube.repository;

import generated.youTube.dto.LikeHistoryDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class LikeHistoryRepository {
    private final Map<String, LikeHistoryDto> store = new LinkedHashMap<>();

    public List<LikeHistoryDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<LikeHistoryDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public LikeHistoryDto save(LikeHistoryDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
