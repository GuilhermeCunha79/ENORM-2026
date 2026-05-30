package generated.reddit.web.generated;

import generated.reddit.domain.MediaAttachment;
import generated.reddit.service.generated.GeneratedMediaAttachmentService;
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
@RequestMapping("/api/mediaAttachments")
public class GeneratedMediaAttachmentController {
    protected final GeneratedMediaAttachmentService service;

    public GeneratedMediaAttachmentController(GeneratedMediaAttachmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<MediaAttachment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public MediaAttachment get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MediaAttachment create(@RequestBody MediaAttachment entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public MediaAttachment update(@PathVariable String id, @RequestBody MediaAttachment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
