package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedPostService;

@Service
public class PostService extends GeneratedPostService {
    public PostService(PostRepository repository) {
        super(repository);
    }
}
