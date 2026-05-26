package generated.youTube.api;

import generated.youTube.dto.CommentSettingsChangeDto;
import generated.youTube.service.CommentSettingsChangeService;
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
public class CommentSettingsChangeController {
    private final CommentSettingsChangeService service;

    public CommentSettingsChangeController(CommentSettingsChangeService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommentSettingsChangeDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CommentSettingsChangeDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CommentSettingsChangeDto create(@RequestBody CommentSettingsChangeDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public CommentSettingsChangeDto update(@PathVariable String id, @RequestBody CommentSettingsChangeDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
