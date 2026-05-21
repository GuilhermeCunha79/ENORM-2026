package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.repository.PostreportRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedPostreportService;

@Service
public class PostreportService extends GeneratedPostreportService {
    public PostreportService(PostreportRepository repository) {
        super(repository);
    }
}
