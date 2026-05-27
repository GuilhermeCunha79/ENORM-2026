package generated.reddit.api;

import java.util.List;
import java.util.Map;
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
public class SubredditApiController {
    @GetMapping public List<String> list() { return List.of(); }
    @GetMapping("/{subredditId}") public Map<String, String> get(@PathVariable String subredditId) { return Map.of("subredditId", subredditId); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Map<String, Object> create(@RequestBody Map<String, Object> payload) { return payload; }
    @PutMapping("/{subredditId}") public Map<String, Object> update(@PathVariable String subredditId, @RequestBody Map<String, Object> payload) { return payload; }
    @DeleteMapping("/{subredditId}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable String subredditId) {}

    @PostMapping("/{subredditId}/posts")
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, String> createPost(@PathVariable String subredditId, @RequestBody Map<String, Object> payload) { return Map.of("subredditId", subredditId, "status", "post-created"); }
}
