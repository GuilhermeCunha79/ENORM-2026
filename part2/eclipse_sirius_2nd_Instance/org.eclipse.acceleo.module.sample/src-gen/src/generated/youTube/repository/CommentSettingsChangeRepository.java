package generated.youTube.repository;

import generated.youTube.dto.CommentSettingsChangeDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class CommentSettingsChangeRepository {
    private final Map<String, CommentSettingsChangeDto> store = new LinkedHashMap<>();

    public List<CommentSettingsChangeDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<CommentSettingsChangeDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public CommentSettingsChangeDto save(CommentSettingsChangeDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
