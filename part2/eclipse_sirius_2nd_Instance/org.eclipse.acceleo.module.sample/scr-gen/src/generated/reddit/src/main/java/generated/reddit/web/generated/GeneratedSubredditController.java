package generated.reddit.web.generated;

import generated.reddit.domain.Subreddit;
import generated.reddit.service.generated.GeneratedSubredditService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subreddits")
public class GeneratedSubredditController {
    private final GeneratedSubredditService service;

    public GeneratedSubredditController(GeneratedSubredditService service) {
        this.service = service;
    }

    @GetMapping
    public List<Subreddit> list() { return service.list(); }

    @GetMapping("/{subredditId}")
    public Subreddit get(@PathVariable String subredditId) { return service.get(subredditId); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Subreddit create(@RequestBody Subreddit payload) { return service.create(payload); }

    @PutMapping("/{subredditId}")
    public Subreddit update(@PathVariable String subredditId, @RequestBody Subreddit payload) { return service.update(subredditId, payload); }

    @DeleteMapping("/{subredditId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String subredditId) { service.delete(subredditId); }

    @PostMapping("/{subredditId}/posts")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPost(@PathVariable String subredditId, @RequestBody Object payload) { }
}
