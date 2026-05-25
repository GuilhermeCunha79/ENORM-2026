package generated.reddit.repository;

import generated.reddit.dto.SubredditDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class SubredditRepository {
    private final Map<String, SubredditDto> store = new LinkedHashMap<>();

    public List<SubredditDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<SubredditDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public SubredditDto save(SubredditDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
