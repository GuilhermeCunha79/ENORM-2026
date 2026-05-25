package generated.reddit.api;

import generated.reddit.dto.PostModerationCheckDto;
import generated.reddit.service.PostModerationCheckService;
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
@RequestMapping("/api/postModerationChecks")
public class PostModerationCheckController {
    private final PostModerationCheckService service;

    public PostModerationCheckController(PostModerationCheckService service) {
        this.service = service;
    }

    @GetMapping
    public List<PostModerationCheckDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PostModerationCheckDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PostModerationCheckDto create(@RequestBody PostModerationCheckDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public PostModerationCheckDto update(@PathVariable String id, @RequestBody PostModerationCheckDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
