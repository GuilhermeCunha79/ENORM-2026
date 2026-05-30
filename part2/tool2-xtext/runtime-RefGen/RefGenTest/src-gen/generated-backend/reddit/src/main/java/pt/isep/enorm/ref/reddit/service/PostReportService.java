package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.repository.PostReportRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedPostReportService;

@Service
public class PostReportService extends GeneratedPostReportService {
    public PostReportService(PostReportRepository repository) {
        super(repository);
    }
}
