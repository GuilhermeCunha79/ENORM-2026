package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.domain.ReplyVideoComment;
import pt.isep.enorm.ref.youtube.repository.ReplyVideoCommentRepository;

@Service
public class GeneratedReplyVideoCommentService {
    private final ReplyVideoCommentRepository repository;

    public GeneratedReplyVideoCommentService(ReplyVideoCommentRepository repository) {
        this.repository = repository;
    }

    public List<ReplyVideoComment> findAll() {
        return repository.findAll();
    }

    public ReplyVideoComment submit(ReplyVideoComment feedback) {
        checkUniquePerAuthorTarget(feedback);
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    private void checkUniquePerAuthorTarget(ReplyVideoComment feedback) {
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(ReplyVideoComment feedback) {
    }
}
