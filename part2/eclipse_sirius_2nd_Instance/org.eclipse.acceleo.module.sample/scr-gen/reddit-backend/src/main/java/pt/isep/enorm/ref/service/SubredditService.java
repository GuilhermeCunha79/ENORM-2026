package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.service.generated.GeneratedSubredditService;
import pt.isep.enorm.ref.repository.SubredditRepository;
import org.springframework.stereotype.Service;

@Service
public class SubredditService extends GeneratedSubredditService {
    public SubredditService(SubredditRepository repository) {
        super(repository);
    }
}
