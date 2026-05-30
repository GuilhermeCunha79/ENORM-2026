package generated.amazon.web.generated;

import generated.amazon.domain.ReviewPolicy;
import generated.amazon.service.generated.GeneratedReviewPolicyService;
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
@RequestMapping("/api/reviewPolicys")
public class GeneratedReviewPolicyController {
    protected final GeneratedReviewPolicyService service;

    public GeneratedReviewPolicyController(GeneratedReviewPolicyService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReviewPolicy> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ReviewPolicy get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ReviewPolicy create(@RequestBody ReviewPolicy entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public ReviewPolicy update(@PathVariable String id, @RequestBody ReviewPolicy entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
