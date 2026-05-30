package generated.youTube.service.generated;

import generated.youTube.domain.ChannelPermissionPolicy;
import generated.youTube.repository.generated.GeneratedChannelPermissionPolicyRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedChannelPermissionPolicyService {
    protected final GeneratedChannelPermissionPolicyRepository repository;

    public GeneratedChannelPermissionPolicyService(GeneratedChannelPermissionPolicyRepository repository) {
        this.repository = repository;
    }

    public List<ChannelPermissionPolicy> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public ChannelPermissionPolicy get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ChannelPermissionPolicy not found"));
    }

    public ChannelPermissionPolicy create(ChannelPermissionPolicy entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public ChannelPermissionPolicy update(String id, ChannelPermissionPolicy entity) {
        ChannelPermissionPolicy current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ChannelPermissionPolicy not found"));
        current.setAction(entity.getAction());
        current.setAllowedFor(entity.getAllowedFor());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ChannelPermissionPolicy not found");
        }
        repository.deleteById(id);
    }

}
