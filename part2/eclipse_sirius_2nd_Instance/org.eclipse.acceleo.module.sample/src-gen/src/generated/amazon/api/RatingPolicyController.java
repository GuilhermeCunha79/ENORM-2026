package generated.amazon.api;

import generated.amazon.dto.RatingPolicyDto;
import generated.amazon.service.RatingPolicyService;
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
@RequestMapping("/api/ratingPolicys")
public class RatingPolicyController {
    private final RatingPolicyService service;

    public RatingPolicyController(RatingPolicyService service) {
        this.service = service;
    }

    @GetMapping
    public List<RatingPolicyDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public RatingPolicyDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RatingPolicyDto create(@RequestBody RatingPolicyDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public RatingPolicyDto update(@PathVariable String id, @RequestBody RatingPolicyDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
