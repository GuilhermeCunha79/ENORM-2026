package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.domain.Replyvideocomment;
import pt.isep.enorm.ref.youtube.repository.ReplyvideocommentRepository;

@Service
public class GeneratedReplyvideocommentService {
    private final ReplyvideocommentRepository repository;

    public GeneratedReplyvideocommentService(ReplyvideocommentRepository repository) {
        this.repository = repository;
    }

    public List<Replyvideocomment> findAll() {
        return repository.findAll();
    }

    public Replyvideocomment submit(Replyvideocomment feedback) {
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(Replyvideocomment feedback) {
    }
}
