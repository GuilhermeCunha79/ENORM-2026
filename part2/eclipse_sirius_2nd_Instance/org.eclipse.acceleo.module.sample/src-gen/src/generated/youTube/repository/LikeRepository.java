package generated.youTube.repository;

import generated.youTube.dto.LikeDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class LikeRepository {
    private final Map<String, LikeDto> store = new LinkedHashMap<>();

    public List<LikeDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<LikeDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public LikeDto save(LikeDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
