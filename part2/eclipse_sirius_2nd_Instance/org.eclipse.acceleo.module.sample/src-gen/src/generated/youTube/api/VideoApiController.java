package generated.youTube.api;

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
@RequestMapping("/api/videos")
public class VideoApiController {
    @GetMapping public List<String> list(@RequestParam(required = false) String channelId) { return List.of(); }
    @GetMapping("/{videoId}") public Map<String, String> get(@PathVariable String videoId) { return Map.of("videoId", videoId); }
    @PutMapping("/{videoId}") public Map<String, Object> update(@PathVariable String videoId, @RequestBody Map<String, Object> payload) { return payload; }
    @DeleteMapping("/{videoId}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable String videoId) {}
}
