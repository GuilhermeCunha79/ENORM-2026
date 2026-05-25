package generated.amazon.api;

import generated.amazon.dto.HelpfulVoteDto;
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
    public List<HelpfulVoteDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public HelpfulVoteDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public HelpfulVoteDto create(@RequestBody HelpfulVoteDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public HelpfulVoteDto update(@PathVariable String id, @RequestBody HelpfulVoteDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/{id}/helpfulVoteOnReview")
    public String productReview(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for helpfulVoteOnReview";
    }
}
