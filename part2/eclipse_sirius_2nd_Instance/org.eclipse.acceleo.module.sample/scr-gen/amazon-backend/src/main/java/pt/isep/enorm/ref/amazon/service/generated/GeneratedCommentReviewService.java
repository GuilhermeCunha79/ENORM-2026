package pt.isep.enorm.ref.amazon.service.generated;

import pt.isep.enorm.ref.amazon.domain.CommentReview;
import pt.isep.enorm.ref.amazon.repository.generated.GeneratedCommentReviewRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GeneratedCommentReviewService {
    protected final GeneratedCommentReviewRepository repository;

    public GeneratedCommentReviewService(GeneratedCommentReviewRepository repository) {
        this.repository = repository;
    }

    public List<CommentReview> list() {
        return repository.findAll();
    }

    public CommentReview get(String id) {
        return repository.findById(toLong(id))
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommentReview '" + id + "' was not found."));
    }

    public CommentReview create(CommentReview entity) {
        return repository.save(entity);
    }

    public CommentReview update(String id, CommentReview entity) {
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
