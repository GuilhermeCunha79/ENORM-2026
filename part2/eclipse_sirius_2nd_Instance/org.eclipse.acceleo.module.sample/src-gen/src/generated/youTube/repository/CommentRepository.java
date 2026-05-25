package generated.youTube.repository;

import generated.youTube.dto.CommentDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {
    private final Map<String, CommentDto> store = new LinkedHashMap<>();

    public List<CommentDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<CommentDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public CommentDto save(CommentDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
