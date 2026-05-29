package generated.reddit.service.generated;

import generated.reddit.domain.CommunityRule;
import generated.reddit.repository.generated.GeneratedCommunityRuleRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedCommunityRuleService {
    protected final GeneratedCommunityRuleRepository repository;

    public GeneratedCommunityRuleService(GeneratedCommunityRuleRepository repository) {
        this.repository = repository;
    }

    public List<CommunityRule> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public CommunityRule get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunityRule not found"));
    }

    public CommunityRule create(CommunityRule entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public CommunityRule update(String id, CommunityRule entity) {
        CommunityRule current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunityRule not found"));
        current.setTitle(entity.getTitle());
        current.setDescription(entity.getDescription());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunityRule not found");
        }
        repository.deleteById(id);
    }

}
