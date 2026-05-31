package pt.isep.enorm.ref.service.generated;

import pt.isep.enorm.ref.domain.Like;
import pt.isep.enorm.ref.repository.generated.GeneratedLikeRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GeneratedLikeService {
    protected final GeneratedLikeRepository repository;

    public GeneratedLikeService(GeneratedLikeRepository repository) {
        this.repository = repository;
    }

    public List<Like> list() {
        return repository.findAll();
    }

    public Like get(String id) {
        return repository.findById(toLong(id))
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Like '" + id + "' was not found."));
    }

    public Like create(Like entity) {
        return repository.save(entity);
    }

    public Like update(String id, Like entity) {
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
