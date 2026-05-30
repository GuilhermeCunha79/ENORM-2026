package pt.isep.enorm.ref.reddit.service;

import pt.isep.enorm.ref.reddit.service.generated.GeneratedSubredditService;
import pt.isep.enorm.ref.reddit.repository.SubredditRepository;
import org.springframework.stereotype.Service;

@Service
public class SubredditService extends GeneratedSubredditService {
    public SubredditService(SubredditRepository repository) {
        super(repository);
    }
}
