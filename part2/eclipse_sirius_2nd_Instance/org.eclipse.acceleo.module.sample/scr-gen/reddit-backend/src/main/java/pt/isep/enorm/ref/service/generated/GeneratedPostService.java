package pt.isep.enorm.ref.service.generated;

import pt.isep.enorm.ref.domain.Post;
import pt.isep.enorm.ref.repository.generated.GeneratedPostRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GeneratedPostService {
    protected final GeneratedPostRepository repository;

    public GeneratedPostService(GeneratedPostRepository repository) {
        this.repository = repository;
    }

    public List<Post> list() {
        return repository.findAll();
    }

    public Post get(String id) {
        return repository.findById(toLong(id))
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Post '" + id + "' was not found."));
    }

    public Post create(Post entity) {
        return repository.save(entity);
    }

    public Post update(String id, Post entity) {
        entity.setId(toLong(id));
        return repository.save(entity);
    }

    public void delete(String id) {
        repository.deleteById(toLong(id));
    }

    private Long toLong(String id) {
        try {
            return Long.valueOf(id);
        } catch (NumberFormatException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid numeric id: " + id);
        }
    }
}
