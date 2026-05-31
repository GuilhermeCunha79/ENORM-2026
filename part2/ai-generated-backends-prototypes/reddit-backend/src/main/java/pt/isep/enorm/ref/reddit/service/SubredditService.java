package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.reddit.repository.SubredditRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedSubredditService;

@Service
public class SubredditService extends GeneratedSubredditService {

    public SubredditService(SubredditRepository subredditRepository) {
        super(subredditRepository);
    }
}



