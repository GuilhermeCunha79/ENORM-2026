package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.service.generated.GeneratedPostService;
import pt.isep.enorm.ref.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService extends GeneratedPostService {
    public PostService(PostRepository repository) {
        super(repository);
    }
}
