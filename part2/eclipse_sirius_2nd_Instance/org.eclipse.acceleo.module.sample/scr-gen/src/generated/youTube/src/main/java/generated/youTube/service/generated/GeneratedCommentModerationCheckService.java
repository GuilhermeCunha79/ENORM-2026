package generated.youTube.service.generated;

import generated.youTube.domain.CommentModerationCheck;
import generated.youTube.repository.generated.GeneratedCommentModerationCheckRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedCommentModerationCheckService {
    protected final GeneratedCommentModerationCheckRepository repository;

    public GeneratedCommentModerationCheckService(GeneratedCommentModerationCheckRepository repository) {
        this.repository = repository;
    }

    public List<CommentModerationCheck> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public CommentModerationCheck get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommentModerationCheck not found"));
    }

    public CommentModerationCheck create(CommentModerationCheck entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public CommentModerationCheck update(String id, CommentModerationCheck entity) {
        CommentModerationCheck current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommentModerationCheck not found"));
        current.setType(entity.getType());
        current.setResult(entity.getResult());
        current.setTimestamp(entity.getTimestamp());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CommentModerationCheck not found");
        }
        repository.deleteById(id);
    }

}
