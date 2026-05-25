package generated.reddit.repository;

import generated.reddit.dto.VoteDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class VoteRepository {
    private final Map<String, VoteDto> store = new LinkedHashMap<>();

    public List<VoteDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<VoteDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public VoteDto save(VoteDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
