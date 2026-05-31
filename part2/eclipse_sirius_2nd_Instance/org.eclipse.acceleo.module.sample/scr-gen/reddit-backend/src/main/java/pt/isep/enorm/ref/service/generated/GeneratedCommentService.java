package pt.isep.enorm.ref.service.generated;

import pt.isep.enorm.ref.domain.Comment;
import pt.isep.enorm.ref.repository.generated.GeneratedCommentRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GeneratedCommentService {
    protected final GeneratedCommentRepository repository;

    public GeneratedCommentService(GeneratedCommentRepository repository) {
        this.repository = repository;
    }

    public List<Comment> list() {
        return repository.findAll();
    }

    public Comment get(String id) {
        return repository.findById(toLong(id))
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Comment '" + id + "' was not found."));
    }

    public Comment create(Comment entity) {
        return repository.save(entity);
    }

    public Comment update(String id, Comment entity) {
        entity.setId(toLong(id));
        return repository.save(entity);
    }

    public void delete(String id) {
        repository.delete(get(id));
    }

    private Long toLong(String id) {
        try {
            return Long.valueOf(id);
        } catch (NumberFormatException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid numeric id: " + id);
        }
    }
}
