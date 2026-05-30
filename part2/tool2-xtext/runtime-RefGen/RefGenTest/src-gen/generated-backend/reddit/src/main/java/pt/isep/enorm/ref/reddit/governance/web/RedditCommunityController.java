package pt.isep.enorm.ref.reddit.governance.web;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.reddit.governance.domain.RedditCommunity;
import pt.isep.enorm.ref.reddit.governance.repository.RedditCommunityRepository;

@RestController
@RequestMapping("/api/contexts/reddit-community")
public class RedditCommunityController {
    private final RedditCommunityRepository repository;

    public RedditCommunityController(RedditCommunityRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<RedditCommunity> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public RedditCommunity get(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("RedditCommunity not found: " + id));
    }

    @PostMapping
    public ResponseEntity<RedditCommunity> create(@RequestBody RedditCommunity body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(body));
    }
}
