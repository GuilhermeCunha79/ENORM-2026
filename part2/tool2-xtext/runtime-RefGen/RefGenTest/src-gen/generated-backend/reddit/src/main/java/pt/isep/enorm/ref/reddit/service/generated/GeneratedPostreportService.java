package pt.isep.enorm.ref.reddit.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.domain.PostReport;
import pt.isep.enorm.ref.reddit.repository.PostReportRepository;

@Service
public class GeneratedPostReportService {
    private final PostReportRepository repository;

    public GeneratedPostReportService(PostReportRepository repository) {
        this.repository = repository;
    }

    public List<PostReport> findAll() {
        return repository.findAll();
    }

    public PostReport submit(PostReport feedback) {
        checkUniquePerAuthorTarget(feedback);
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    private void checkUniquePerAuthorTarget(PostReport feedback) {
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(PostReport feedback) {
    }
}
