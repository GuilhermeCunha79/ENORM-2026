package generated.reddit.service.generated;

import generated.reddit.domain.Post;
import generated.reddit.repository.generated.GeneratedPostRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedPostService {
    protected final GeneratedPostRepository repository;

    public GeneratedPostService(GeneratedPostRepository repository) {
        this.repository = repository;
    }

    public List<Post> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public Post get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found"));
    }

    public Post create(Post entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public Post update(String id, Post entity) {
        Post current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found"));
        current.setTitle(entity.getTitle());
        current.setBody(entity.getBody());
        current.setType(entity.getType());
        current.setSupportsVote(entity.getSupportsVote());
        current.setSupportsReport(entity.getSupportsReport());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found");
        }
        repository.deleteById(id);
    }

}
