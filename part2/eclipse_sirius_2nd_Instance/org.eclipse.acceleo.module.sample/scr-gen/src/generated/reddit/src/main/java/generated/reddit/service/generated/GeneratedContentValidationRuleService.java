package generated.reddit.service.generated;

import generated.reddit.domain.ContentValidationRule;
import generated.reddit.repository.generated.GeneratedContentValidationRuleRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedContentValidationRuleService {
    protected final GeneratedContentValidationRuleRepository repository;

    public GeneratedContentValidationRuleService(GeneratedContentValidationRuleRepository repository) {
        this.repository = repository;
    }

    public List<ContentValidationRule> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public ContentValidationRule get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentValidationRule not found"));
    }

    public ContentValidationRule create(ContentValidationRule entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public ContentValidationRule update(String id, ContentValidationRule entity) {
        ContentValidationRule current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentValidationRule not found"));
        current.setTarget(entity.getTarget());
        current.setSeverity(entity.getSeverity());
        current.setCondition(entity.getCondition());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentValidationRule not found");
        }
        repository.deleteById(id);
    }

}
