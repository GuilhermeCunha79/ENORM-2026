package generated.reddit.api;

import generated.reddit.dto.VoteDto;
import generated.reddit.service.VoteService;
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
@RequestMapping("/api/votes")
public class VoteController {
    private final VoteService service;

    public VoteController(VoteService service) {
        this.service = service;
    }

    @GetMapping
    public List<VoteDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public VoteDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VoteDto create(@RequestBody VoteDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public VoteDto update(@PathVariable String id, @RequestBody VoteDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/{id}/voteOnContent")
    public String content(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for voteOnContent";
    }
}
