package generated.reddit.web.generated;

import generated.reddit.domain.ContentValidationRule;
import generated.reddit.service.generated.GeneratedContentValidationRuleService;
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
@RequestMapping("/api/contentValidationRules")
public class GeneratedContentValidationRuleController {
    protected final GeneratedContentValidationRuleService service;

    public GeneratedContentValidationRuleController(GeneratedContentValidationRuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContentValidationRule> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContentValidationRule get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContentValidationRule create(@RequestBody ContentValidationRule entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public ContentValidationRule update(@PathVariable String id, @RequestBody ContentValidationRule entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
