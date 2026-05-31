package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.PostVoteRepository;
import pt.isep.enorm.ref.service.generated.GeneratedPostVoteService;

@Service
public class PostVoteService extends GeneratedPostVoteService {
    public PostVoteService(PostVoteRepository repository) {
        super(repository);
    }
}
