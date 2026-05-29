package generated.reddit.service.generated;

import generated.reddit.domain.Content;
import generated.reddit.repository.generated.GeneratedContentRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedContentService {
    protected final GeneratedContentRepository repository;

    public GeneratedContentService(GeneratedContentRepository repository) {
        this.repository = repository;
    }

    public List<Content> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public Content get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));
    }

    public Content create(Content entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public Content update(String id, Content entity) {
        Content current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));
        current.setCreationDate(entity.getCreationDate());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
        }
        repository.deleteById(id);
    }

}
