package generated.amazon.api;

import generated.amazon.domain.HelpfulVote;
import generated.amazon.service.HelpfulVoteService;
import java.util.List;
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
@RequestMapping("/api/helpfulVotes")
public class HelpfulVoteController {
    private final HelpfulVoteService service;

    public HelpfulVoteController(HelpfulVoteService service) {
        this.service = service;
    }

    @GetMapping
    public List<HelpfulVote> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public HelpfulVote get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public HelpfulVote create(@RequestBody HelpfulVote entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public HelpfulVote update(@PathVariable String id, @RequestBody HelpfulVote entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
