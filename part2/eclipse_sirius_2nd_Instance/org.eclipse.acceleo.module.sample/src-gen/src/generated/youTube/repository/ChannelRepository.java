package generated.youTube.repository;

import generated.youTube.dto.ChannelDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ChannelRepository {
    private final Map<String, ChannelDto> store = new LinkedHashMap<>();

    public List<ChannelDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<ChannelDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public ChannelDto save(ChannelDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
