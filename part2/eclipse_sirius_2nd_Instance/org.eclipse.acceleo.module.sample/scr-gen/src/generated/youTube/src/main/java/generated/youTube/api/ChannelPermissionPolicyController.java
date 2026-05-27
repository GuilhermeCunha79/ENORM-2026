package generated.youTube.api;

import generated.youTube.domain.ChannelPermissionPolicy;
import generated.youTube.service.ChannelPermissionPolicyService;
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
@RequestMapping("/api/channelPermissionPolicys")
public class ChannelPermissionPolicyController {
    private final ChannelPermissionPolicyService service;

    public ChannelPermissionPolicyController(ChannelPermissionPolicyService service) {
        this.service = service;
    }

    @GetMapping
    public List<ChannelPermissionPolicy> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ChannelPermissionPolicy get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ChannelPermissionPolicy create(@RequestBody ChannelPermissionPolicy entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public ChannelPermissionPolicy update(@PathVariable String id, @RequestBody ChannelPermissionPolicy entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
