package pt.isep.enorm.ref.reddit.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.domain.Comment;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;

@Service
public class GeneratedCommentService {
    private final CommentRepository repository;

    public GeneratedCommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public List<Comment> findAll() {
        return repository.findAll();
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
