package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.PostRepository;
import pt.isep.enorm.ref.service.generated.GeneratedPostService;

@Service
public class PostService extends GeneratedPostService {
    public PostService(PostRepository repository) {
        super(repository);
    }
}
