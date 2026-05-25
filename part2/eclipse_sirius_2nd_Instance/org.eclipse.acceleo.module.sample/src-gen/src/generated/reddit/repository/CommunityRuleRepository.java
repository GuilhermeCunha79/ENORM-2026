package generated.reddit.repository;

import generated.reddit.dto.CommunityRuleDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class CommunityRuleRepository {
    private final Map<String, CommunityRuleDto> store = new LinkedHashMap<>();

    public List<CommunityRuleDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<CommunityRuleDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public CommunityRuleDto save(CommunityRuleDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
