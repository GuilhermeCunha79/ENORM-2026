package generated.youTube.repository;

import generated.youTube.dto.CommentModerationCheckDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class CommentModerationCheckRepository {
    private final Map<String, CommentModerationCheckDto> store = new LinkedHashMap<>();

    public List<CommentModerationCheckDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<CommentModerationCheckDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public CommentModerationCheckDto save(CommentModerationCheckDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
