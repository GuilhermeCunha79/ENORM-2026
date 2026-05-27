package generated.amazon.service;

import generated.amazon.domain.RatingPolicy;
import generated.amazon.repository.RatingPolicyRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class RatingPolicyService {
    private final RatingPolicyRepository repository;

    public RatingPolicyService(RatingPolicyRepository repository) {
        this.repository = repository;
    }

    public List<RatingPolicy> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public RatingPolicy get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RatingPolicy not found"));
    }

    public RatingPolicy create(RatingPolicy entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public RatingPolicy update(String id, RatingPolicy entity) {
        RatingPolicy current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RatingPolicy not found"));
        current.setMinValue(entity.getMinValue());
        current.setMaxValue(entity.getMaxValue());
        current.setStep(entity.getStep());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RatingPolicy not found");
        }
        repository.deleteById(id);
    }

}
