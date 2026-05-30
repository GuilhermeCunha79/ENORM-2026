package pt.isep.enorm.ref.amazon.web.generated;

import pt.isep.enorm.ref.amazon.domain.HelpfulVote;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedHelpfulVoteService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comments/{commentId}/votes")
public class GeneratedHelpfulVoteController {
    private final GeneratedHelpfulVoteService service;

    public GeneratedHelpfulVoteController(GeneratedHelpfulVoteService service) { this.service = service; }

    @GetMapping
    public List<HelpfulVote> list(@PathVariable String commentId) { return service.list(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public HelpfulVote create(@PathVariable String commentId, @RequestBody HelpfulVote payload) { return service.create(payload); }

    @DeleteMapping("/{voteId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String commentId, @PathVariable String voteId) { service.delete(voteId); }
}
