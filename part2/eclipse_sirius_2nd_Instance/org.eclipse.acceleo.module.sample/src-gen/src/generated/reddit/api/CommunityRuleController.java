package generated.reddit.api;

import generated.reddit.dto.CommunityRuleDto;
import generated.reddit.service.CommunityRuleService;
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
@RequestMapping("/api/communityRules")
public class CommunityRuleController {
    private final CommunityRuleService service;

    public CommunityRuleController(CommunityRuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommunityRuleDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CommunityRuleDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CommunityRuleDto create(@RequestBody CommunityRuleDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public CommunityRuleDto update(@PathVariable String id, @RequestBody CommunityRuleDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
