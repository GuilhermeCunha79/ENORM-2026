package generated.reddit.repository;

import generated.reddit.dto.PostModerationCheckDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class PostModerationCheckRepository {
    private final Map<String, PostModerationCheckDto> store = new LinkedHashMap<>();

    public List<PostModerationCheckDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<PostModerationCheckDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public PostModerationCheckDto save(PostModerationCheckDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
