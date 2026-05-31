package pt.isep.enorm.ref.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.domain.TopThreadComment;
import pt.isep.enorm.ref.repository.TopThreadCommentRepository;

@Service
public class GeneratedTopThreadCommentService {
    private final TopThreadCommentRepository repository;

    public GeneratedTopThreadCommentService(TopThreadCommentRepository repository) {
        this.repository = repository;
    }

    public List<TopThreadComment> findAll() {
        return repository.findAll();
    }

    public TopThreadComment submit(TopThreadComment feedback) {
        checkUniquePerAuthorTarget(feedback);
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    private void checkUniquePerAuthorTarget(TopThreadComment feedback) {
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(TopThreadComment feedback) {
    }
}
