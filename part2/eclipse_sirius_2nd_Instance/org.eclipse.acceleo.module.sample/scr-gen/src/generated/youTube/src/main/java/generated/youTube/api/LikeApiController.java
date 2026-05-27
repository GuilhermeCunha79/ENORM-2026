package generated.youTube.api;

import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/likes")
public class LikeApiController {
    @GetMapping public List<String> list(@RequestParam(required = false) String videoId, @RequestParam(required = false) String commentId) { return List.of(); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Map<String, Object> create(@RequestParam(required = false) String videoId, @RequestParam(required = false) String commentId, @RequestBody Map<String, Object> payload) { return payload; }
    @DeleteMapping("/{likeId}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable String likeId) {}
}
