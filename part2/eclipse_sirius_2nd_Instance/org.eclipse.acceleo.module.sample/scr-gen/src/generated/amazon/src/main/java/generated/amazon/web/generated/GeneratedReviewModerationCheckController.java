package generated.amazon.web.generated;

import generated.amazon.domain.ReviewModerationCheck;
import generated.amazon.service.generated.GeneratedReviewModerationCheckService;
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
@RequestMapping("/api/reviewModerationChecks")
public class GeneratedReviewModerationCheckController {
    protected final GeneratedReviewModerationCheckService service;

    public GeneratedReviewModerationCheckController(GeneratedReviewModerationCheckService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReviewModerationCheck> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ReviewModerationCheck get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ReviewModerationCheck create(@RequestBody ReviewModerationCheck entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public ReviewModerationCheck update(@PathVariable String id, @RequestBody ReviewModerationCheck entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
