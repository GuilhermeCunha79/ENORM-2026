package generated.reddit.repository;

import generated.reddit.dto.PostDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {
    private final Map<String, PostDto> store = new LinkedHashMap<>();

    public List<PostDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<PostDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public PostDto save(PostDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
