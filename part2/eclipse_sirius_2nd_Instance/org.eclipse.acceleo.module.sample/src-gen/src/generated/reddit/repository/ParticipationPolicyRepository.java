package generated.reddit.repository;

import generated.reddit.dto.ParticipationPolicyDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ParticipationPolicyRepository {
    private final Map<String, ParticipationPolicyDto> store = new LinkedHashMap<>();

    public List<ParticipationPolicyDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<ParticipationPolicyDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public ParticipationPolicyDto save(ParticipationPolicyDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
