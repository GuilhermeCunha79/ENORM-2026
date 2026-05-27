package generated.reddit.service;

import generated.reddit.domain.ParticipationPolicy;
import generated.reddit.repository.ParticipationPolicyRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ParticipationPolicyService {
    private final ParticipationPolicyRepository repository;

    public ParticipationPolicyService(ParticipationPolicyRepository repository) {
        this.repository = repository;
    }

    public List<ParticipationPolicy> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public ParticipationPolicy get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ParticipationPolicy not found"));
    }

    public ParticipationPolicy create(ParticipationPolicy entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public ParticipationPolicy update(String id, ParticipationPolicy entity) {
        ParticipationPolicy current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ParticipationPolicy not found"));
        current.setAction(entity.getAction());
        current.setAllowedWhen(entity.getAllowedWhen());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ParticipationPolicy not found");
        }
        repository.deleteById(id);
    }

}
