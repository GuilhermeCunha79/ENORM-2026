package generated.reddit.api;

import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comments")
public class CommentApiController {
    @GetMapping public List<String> list(@RequestParam(required = false) String postId) { return List.of(); }
    @GetMapping("/{commentId}") public Map<String, String> get(@PathVariable String commentId) { return Map.of("commentId", commentId); }
    @PutMapping("/{commentId}") public Map<String, Object> update(@PathVariable String commentId, @RequestBody Map<String, Object> payload) { return payload; }
    @DeleteMapping("/{commentId}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable String commentId) {}
}
