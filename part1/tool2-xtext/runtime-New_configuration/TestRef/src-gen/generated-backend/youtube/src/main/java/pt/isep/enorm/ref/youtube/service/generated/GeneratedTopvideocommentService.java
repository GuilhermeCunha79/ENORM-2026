package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.domain.Topvideocomment;
import pt.isep.enorm.ref.youtube.repository.TopvideocommentRepository;

@Service
public class GeneratedTopvideocommentService {
    private final TopvideocommentRepository repository;

    public GeneratedTopvideocommentService(TopvideocommentRepository repository) {
        this.repository = repository;
    }

    public List<Topvideocomment> findAll() {
        return repository.findAll();
    }

    public Topvideocomment submit(Topvideocomment feedback) {
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(Topvideocomment feedback) {
    }
}
