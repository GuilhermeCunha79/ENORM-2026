package pt.isep.enorm.ref.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.domain.ReplyComment;
import pt.isep.enorm.ref.repository.ReplyCommentRepository;

@Service
public class GeneratedReplyCommentService {
    private final ReplyCommentRepository repository;

    public GeneratedReplyCommentService(ReplyCommentRepository repository) {
        this.repository = repository;
    }

    public List<ReplyComment> findAll() {
        return repository.findAll();
    }

    public ReplyComment submit(ReplyComment feedback) {
        checkUniquePerAuthorTarget(feedback);
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    private void checkUniquePerAuthorTarget(ReplyComment feedback) {
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(ReplyComment feedback) {
    }
}
