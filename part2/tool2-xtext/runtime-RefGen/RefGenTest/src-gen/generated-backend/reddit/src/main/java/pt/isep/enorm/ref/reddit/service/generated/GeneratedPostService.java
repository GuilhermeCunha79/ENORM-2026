package pt.isep.enorm.ref.reddit.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.repository.PostRepository;

@Service
public class GeneratedPostService {
    private final PostRepository repository;

    public GeneratedPostService(PostRepository repository) {
        this.repository = repository;
    }

    public List<Post> findAll() {
        return repository.findAll();
    }

    public Post findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Post not found: " + id));
    }

    public Post create(Post entity) {
        return repository.save(entity);
    }

    /** Override in manual PostService for scenario-specific rules. */
    protected void beforeCreate(Post entity) {
    }
}
