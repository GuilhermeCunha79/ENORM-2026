package generated.youTube.api;

import generated.youTube.dto.ContentValidationRuleDto;
import generated.youTube.service.ContentValidationRuleService;
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
public class ContentValidationRuleController {
    private final ContentValidationRuleService service;

    public ContentValidationRuleController(ContentValidationRuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContentValidationRuleDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ContentValidationRuleDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContentValidationRuleDto create(@RequestBody ContentValidationRuleDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public ContentValidationRuleDto update(@PathVariable String id, @RequestBody ContentValidationRuleDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
