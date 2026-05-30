package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.repository.PostVoteRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedPostVoteService;

@Service
public class PostVoteService extends GeneratedPostVoteService {
    public PostVoteService(PostVoteRepository repository) {
        super(repository);
    }
}
