package generated.reddit.repository;

import generated.reddit.dto.ContentDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ContentRepository {
    private final Map<String, ContentDto> store = new LinkedHashMap<>();

    public List<ContentDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<ContentDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public ContentDto save(ContentDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
