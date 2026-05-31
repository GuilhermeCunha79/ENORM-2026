package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.PostReportRepository;
import pt.isep.enorm.ref.service.generated.GeneratedPostReportService;

@Service
public class PostReportService extends GeneratedPostReportService {
    public PostReportService(PostReportRepository repository) {
        super(repository);
    }
}
