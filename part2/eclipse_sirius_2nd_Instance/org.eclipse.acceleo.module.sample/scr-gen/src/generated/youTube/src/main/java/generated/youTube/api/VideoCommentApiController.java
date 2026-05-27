package generated.youTube.api;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/videos")
public class VideoCommentApiController {
    @PostMapping("/{videoId}/comments")
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, String> create(@PathVariable String videoId, @RequestBody Map<String, Object> payload) { return Map.of("videoId", videoId, "status", "comment-created"); }
}
