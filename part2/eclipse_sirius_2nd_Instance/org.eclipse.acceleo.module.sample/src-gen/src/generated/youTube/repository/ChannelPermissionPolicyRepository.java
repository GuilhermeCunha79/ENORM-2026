package generated.youTube.repository;

import generated.youTube.dto.ChannelPermissionPolicyDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ChannelPermissionPolicyRepository {
    private final Map<String, ChannelPermissionPolicyDto> store = new LinkedHashMap<>();

    public List<ChannelPermissionPolicyDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<ChannelPermissionPolicyDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public ChannelPermissionPolicyDto save(ChannelPermissionPolicyDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
