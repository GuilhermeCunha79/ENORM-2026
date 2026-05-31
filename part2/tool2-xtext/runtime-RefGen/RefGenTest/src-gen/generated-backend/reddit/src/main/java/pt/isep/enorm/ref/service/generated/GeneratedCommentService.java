package pt.isep.enorm.ref.service.generated;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.domain.Comment;
import pt.isep.enorm.ref.repository.CommentRepository;

@Service
public class GeneratedCommentService {
    private final CommentRepository repository;

    public GeneratedCommentService(CommentRepository repository) {
        this.repository = repository;
    }

    /** Fase G: optional sorting driven by SortingPolicy (sortBy = entity property, direction = ASC|DESC). */
    public List<Comment> findAll(String sortBy, String direction) {
        if (sortBy == null || sortBy.isBlank()) {
            return repository.findAll();
        }
        Sort.Direction dir = "DESC".equalsIgnoreCase(direction) ? Sort.Direction.DESC : Sort.Direction.ASC;
        try {
            return repository.findAll(Sort.by(dir, sortBy));
        } catch (RuntimeException ex) {
            return repository.findAll();
        }
    }

    public Comment findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Comment not found: " + id));
    }

    public Comment create(Comment entity) {
        return repository.save(entity);
    }

    /** Override in manual CommentService for scenario-specific rules. */
    protected void beforeCreate(Comment entity) {
    }
}
