package pt.isep.enorm.ref.reddit.web.generated;

import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/policies")
public class GeneratedPolicyController {
    @GetMapping("/subreddits/{subredditId}/permissions") public List<String> permissions(@PathVariable String subredditId) { return List.of(); }
    @PostMapping("/subreddits/{subredditId}/permissions") @ResponseStatus(HttpStatus.CREATED) public Map<String, Object> createPermission(@PathVariable String subredditId, @RequestBody Map<String, Object> payload) { return payload; }
    @GetMapping("/subreddits/{subredditId}/sorting") public List<String> sorting(@PathVariable String subredditId) { return List.of(); }
    @PostMapping("/subreddits/{subredditId}/sorting") @ResponseStatus(HttpStatus.CREATED) public Map<String, Object> createSorting(@PathVariable String subredditId, @RequestBody Map<String, Object> payload) { return payload; }
    @GetMapping("/validation-rules") public List<String> validationRules(@RequestParam(required = false) String postId, @RequestParam(required = false) String commentId) { return List.of(); }
    @PostMapping("/validation-rules") @ResponseStatus(HttpStatus.CREATED) public Map<String, Object> createValidationRule(@RequestParam(required = false) String postId, @RequestParam(required = false) String commentId, @RequestBody Map<String, Object> payload) { return payload; }
}
