package generated.amazon.repository;

import generated.amazon.dto.HelpfulVoteDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class HelpfulVoteRepository {
    private final Map<String, HelpfulVoteDto> store = new LinkedHashMap<>();

    public List<HelpfulVoteDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<HelpfulVoteDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public HelpfulVoteDto save(HelpfulVoteDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
