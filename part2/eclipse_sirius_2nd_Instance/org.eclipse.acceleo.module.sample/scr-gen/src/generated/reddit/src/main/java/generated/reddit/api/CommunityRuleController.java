package generated.reddit.api;

import generated.reddit.domain.CommunityRule;
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
    public List<CommunityRule> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CommunityRule get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CommunityRule create(@RequestBody CommunityRule entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public CommunityRule update(@PathVariable String id, @RequestBody CommunityRule entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
