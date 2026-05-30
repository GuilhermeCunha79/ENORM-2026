package pt.isep.enorm.ref.reddit.service;

import pt.isep.enorm.ref.reddit.service.generated.GeneratedPostService;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService extends GeneratedPostService {
    public PostService(PostRepository repository) {
        super(repository);
    }
}
