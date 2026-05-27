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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostApiController {
    @GetMapping public List<String> list(@RequestParam(required = false) String subredditId) { return List.of(); }
    @GetMapping("/{postId}") public Map<String, String> get(@PathVariable String postId) { return Map.of("postId", postId); }
    @PutMapping("/{postId}") public Map<String, Object> update(@PathVariable String postId, @RequestBody Map<String, Object> payload) { return payload; }
    @DeleteMapping("/{postId}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable String postId) {}

    @PostMapping("/{postId}/comments")
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, String> comment(@PathVariable String postId, @RequestBody Map<String, Object> payload) { return Map.of("postId", postId, "status", "comment-created"); }
}
