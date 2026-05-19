package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.repository.PostvoteRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedPostvoteService;

@Service
public class PostvoteService extends GeneratedPostvoteService {
    public PostvoteService(PostvoteRepository repository) {
        super(repository);
    }
}
