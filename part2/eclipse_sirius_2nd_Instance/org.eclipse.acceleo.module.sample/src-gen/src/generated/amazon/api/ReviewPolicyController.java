package generated.amazon.api;

import generated.amazon.dto.ReviewPolicyDto;
import generated.amazon.service.ReviewPolicyService;
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
public class ReviewPolicyController {
    private final ReviewPolicyService service;

    public ReviewPolicyController(ReviewPolicyService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReviewPolicyDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ReviewPolicyDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ReviewPolicyDto create(@RequestBody ReviewPolicyDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public ReviewPolicyDto update(@PathVariable String id, @RequestBody ReviewPolicyDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
