package pt.isep.enorm.ref.amazon.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.domain.Topthreadcomment;
import pt.isep.enorm.ref.amazon.repository.TopthreadcommentRepository;

@Service
public class GeneratedTopthreadcommentService {
    private final TopthreadcommentRepository repository;

    public GeneratedTopthreadcommentService(TopthreadcommentRepository repository) {
        this.repository = repository;
    }

    public List<Topthreadcomment> findAll() {
        return repository.findAll();
    }

    public Topthreadcomment submit(Topthreadcomment feedback) {
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(Topthreadcomment feedback) {
    }
}
