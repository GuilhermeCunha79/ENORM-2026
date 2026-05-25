package generated.youTube.api;

import generated.youTube.dto.CommentDto;
import generated.youTube.service.CommentService;
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
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommentDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CommentDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CommentDto create(@RequestBody CommentDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public CommentDto update(@PathVariable String id, @RequestBody CommentDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/{id}/commentRepliesToComment")
    public String children(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for commentRepliesToComment";
    }

    @GetMapping("/{id}/commentCheckedByModerationCheck")
    public String commentModerationChecks(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for commentCheckedByModerationCheck";
    }

    @GetMapping("/{id}/commentValidatedBy")
    public String contentValidationRules(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for commentValidatedBy";
    }

    @PostMapping("/{id}/replies")
    public String replyToComment(@PathVariable String id) {
        service.get(id);
        return "Reply to comment thread";
    }

    @PostMapping("/{id}/reports")
    public String reportComment(@PathVariable String id) {
        service.get(id);
        return "Report comment";
    }
}
