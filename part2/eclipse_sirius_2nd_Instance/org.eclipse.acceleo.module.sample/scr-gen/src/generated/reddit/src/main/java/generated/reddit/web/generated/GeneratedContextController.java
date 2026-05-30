package generated.reddit.web.generated;

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
@RequestMapping("/api/contexts")
public class GeneratedContextController {

    @GetMapping
    public List<String> list() {
        return List.of("SubredditCommunity", "ContentChannel", "RedditPlatform");
    }

    @GetMapping("/{contextId}")
    public Map<String, String> get(@PathVariable String contextId) {
        return Map.of("contextId", contextId, "model", "Reddit");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, Object> create(@RequestBody Map<String, Object> payload) {
        return payload;
    }

    @PutMapping("/{contextId}")
    public Map<String, Object> update(@PathVariable String contextId, @RequestBody Map<String, Object> payload) {
        return payload;
    }

    @DeleteMapping("/{contextId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String contextId) {
    }
}
