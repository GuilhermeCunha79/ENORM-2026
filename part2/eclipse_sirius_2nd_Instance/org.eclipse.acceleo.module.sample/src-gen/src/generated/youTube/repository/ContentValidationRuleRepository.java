package generated.youTube.repository;

import generated.youTube.dto.ContentValidationRuleDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ContentValidationRuleRepository {
    private final Map<String, ContentValidationRuleDto> store = new LinkedHashMap<>();

    public List<ContentValidationRuleDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<ContentValidationRuleDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public ContentValidationRuleDto save(ContentValidationRuleDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
