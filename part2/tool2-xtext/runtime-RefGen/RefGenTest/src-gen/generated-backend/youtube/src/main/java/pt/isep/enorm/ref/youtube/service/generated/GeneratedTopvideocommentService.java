package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.domain.TopVideoComment;
import pt.isep.enorm.ref.youtube.repository.TopVideoCommentRepository;

@Service
public class GeneratedTopVideoCommentService {
    private final TopVideoCommentRepository repository;

    public GeneratedTopVideoCommentService(TopVideoCommentRepository repository) {
        this.repository = repository;
    }

    public List<TopVideoComment> findAll() {
        return repository.findAll();
    }

    public TopVideoComment submit(TopVideoComment feedback) {
        checkUniquePerAuthorTarget(feedback);
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    private void checkUniquePerAuthorTarget(TopVideoComment feedback) {
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(TopVideoComment feedback) {
    }
}
