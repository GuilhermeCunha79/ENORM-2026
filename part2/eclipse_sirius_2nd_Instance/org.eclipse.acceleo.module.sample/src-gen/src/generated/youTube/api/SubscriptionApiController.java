package generated.youTube.api;

import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionApiController {
    @GetMapping public List<String> list(@RequestParam(required = false) String userId) { return List.of(); }
    @PostMapping("/{channelId}") @ResponseStatus(HttpStatus.CREATED) public Map<String, String> create(@PathVariable String channelId) { return Map.of("channelId", channelId, "status", "subscription-created"); }
    @DeleteMapping("/{subscriptionId}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable String subscriptionId) {}
}
