package generated.reddit.web.generated;

import generated.reddit.domain.Vote;
import generated.reddit.service.generated.GeneratedVoteService;
import java.util.List;
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
@RequestMapping("/api/votes")
public class GeneratedVoteController {
    private final GeneratedVoteService service;

    public GeneratedVoteController(GeneratedVoteService service) { this.service = service; }

    @GetMapping public List<Vote> list(@RequestParam(required = false) String postId, @RequestParam(required = false) String commentId) { return service.list(); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Vote create(@RequestParam(required = false) String postId, @RequestParam(required = false) String commentId, @RequestBody Vote payload) { return service.create(payload); }
    @DeleteMapping("/{voteId}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable String voteId) { service.delete(voteId); }
}
