package generated.reddit.api;

import generated.reddit.domain.CommentModerationCheck;
import generated.reddit.service.CommentModerationCheckService;
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
@RequestMapping("/api/commentModerationChecks")
public class CommentModerationCheckController {
    private final CommentModerationCheckService service;

    public CommentModerationCheckController(CommentModerationCheckService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommentModerationCheck> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CommentModerationCheck get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CommentModerationCheck create(@RequestBody CommentModerationCheck entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public CommentModerationCheck update(@PathVariable String id, @RequestBody CommentModerationCheck entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
