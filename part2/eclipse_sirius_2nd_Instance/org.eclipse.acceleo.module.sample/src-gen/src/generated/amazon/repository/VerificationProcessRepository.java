package generated.amazon.repository;

import generated.amazon.dto.VerificationProcessDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class VerificationProcessRepository {
    private final Map<String, VerificationProcessDto> store = new LinkedHashMap<>();

    public List<VerificationProcessDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<VerificationProcessDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public VerificationProcessDto save(VerificationProcessDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
