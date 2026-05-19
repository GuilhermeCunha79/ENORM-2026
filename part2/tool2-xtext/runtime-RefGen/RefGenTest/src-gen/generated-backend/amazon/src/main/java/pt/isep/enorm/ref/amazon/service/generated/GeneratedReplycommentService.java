package pt.isep.enorm.ref.amazon.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.domain.Replycomment;
import pt.isep.enorm.ref.amazon.repository.ReplycommentRepository;

@Service
public class GeneratedReplycommentService {
    private final ReplycommentRepository repository;

    public GeneratedReplycommentService(ReplycommentRepository repository) {
        this.repository = repository;
    }

    public List<Replycomment> findAll() {
        return repository.findAll();
    }

    public Replycomment submit(Replycomment feedback) {
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(Replycomment feedback) {
    }
}
