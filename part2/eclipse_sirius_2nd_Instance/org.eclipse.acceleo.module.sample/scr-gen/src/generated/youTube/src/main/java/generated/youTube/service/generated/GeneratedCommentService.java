package generated.youTube.service.generated;

import generated.youTube.domain.Comment;
import generated.youTube.repository.generated.GeneratedCommentRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedCommentService {
    protected final GeneratedCommentRepository repository;

    public GeneratedCommentService(GeneratedCommentRepository repository) {
        this.repository = repository;
    }

    public List<Comment> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public Comment get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Comment not found"));
    }

    public Comment create(Comment entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public Comment update(String id, Comment entity) {
        Comment current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Comment not found"));
        current.setText(entity.getText());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Comment not found");
        }
        repository.deleteById(id);
    }

}
