package generated.reddit.service.generated;

import generated.reddit.domain.PostModerationCheck;
import generated.reddit.repository.generated.GeneratedPostModerationCheckRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedPostModerationCheckService {
    protected final GeneratedPostModerationCheckRepository repository;

    public GeneratedPostModerationCheckService(GeneratedPostModerationCheckRepository repository) {
        this.repository = repository;
    }

    public List<PostModerationCheck> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public PostModerationCheck get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PostModerationCheck not found"));
    }

    public PostModerationCheck create(PostModerationCheck entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public PostModerationCheck update(String id, PostModerationCheck entity) {
        PostModerationCheck current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PostModerationCheck not found"));
        current.setType(entity.getType());
        current.setResult(entity.getResult());
        current.setTimestamp(entity.getTimestamp());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PostModerationCheck not found");
        }
        repository.deleteById(id);
    }

}
