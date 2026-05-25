package generated.reddit.repository;

import generated.reddit.dto.ReportDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ReportRepository {
    private final Map<String, ReportDto> store = new LinkedHashMap<>();

    public List<ReportDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<ReportDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public ReportDto save(ReportDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
