package pt.isep.enorm.ref.reddit.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.service.PostService;

public abstract class GeneratedPostController {
    private final PostService service;

    protected GeneratedPostController(PostService service) {
        this.service = service;
    }

    @GetMapping
    public List<Post> list(
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false, defaultValue = "ASC") String direction) {
        return service.findAll(sortBy, direction);
    }

    @GetMapping("/{id}")
    public Post get(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public ResponseEntity<Post> create(@RequestBody Post body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(body));
    }
}
