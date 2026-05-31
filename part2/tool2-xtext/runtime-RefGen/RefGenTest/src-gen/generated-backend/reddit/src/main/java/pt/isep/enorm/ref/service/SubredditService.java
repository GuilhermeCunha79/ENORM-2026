package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.SubredditRepository;
import pt.isep.enorm.ref.service.generated.GeneratedSubredditService;

@Service
public class SubredditService extends GeneratedSubredditService {
    public SubredditService(SubredditRepository repository) {
        super(repository);
    }
}
