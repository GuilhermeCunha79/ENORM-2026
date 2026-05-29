package generated.youTube.web.generated;

import generated.youTube.domain.CommentSettingsChange;
import generated.youTube.service.generated.GeneratedCommentSettingsChangeService;
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
@RequestMapping("/api/commentSettingsChanges")
public class GeneratedCommentSettingsChangeController {
    protected final GeneratedCommentSettingsChangeService service;

    public GeneratedCommentSettingsChangeController(GeneratedCommentSettingsChangeService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommentSettingsChange> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CommentSettingsChange get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CommentSettingsChange create(@RequestBody CommentSettingsChange entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public CommentSettingsChange update(@PathVariable String id, @RequestBody CommentSettingsChange entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
