package generated.amazon.service.generated;

import generated.amazon.domain.VerificationProcess;
import generated.amazon.repository.generated.GeneratedVerificationProcessRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedVerificationProcessService {
    protected final GeneratedVerificationProcessRepository repository;

    public GeneratedVerificationProcessService(GeneratedVerificationProcessRepository repository) {
        this.repository = repository;
    }

    public List<VerificationProcess> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public VerificationProcess get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "VerificationProcess not found"));
    }

    public VerificationProcess create(VerificationProcess entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public VerificationProcess update(String id, VerificationProcess entity) {
        VerificationProcess current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "VerificationProcess not found"));
        current.setType(entity.getType());
        current.setStatus(entity.getStatus());
        current.setTimestamp(entity.getTimestamp());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "VerificationProcess not found");
        }
        repository.deleteById(id);
    }

}
