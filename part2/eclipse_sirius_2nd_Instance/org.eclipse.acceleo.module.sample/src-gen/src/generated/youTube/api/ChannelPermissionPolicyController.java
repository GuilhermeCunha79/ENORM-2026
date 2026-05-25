package generated.youTube.api;

import generated.youTube.dto.ChannelPermissionPolicyDto;
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
    public List<ChannelPermissionPolicyDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ChannelPermissionPolicyDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ChannelPermissionPolicyDto create(@RequestBody ChannelPermissionPolicyDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public ChannelPermissionPolicyDto update(@PathVariable String id, @RequestBody ChannelPermissionPolicyDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/{id}/channelHasPermissionPolicy")
    public String channel(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for channelHasPermissionPolicy";
    }
}
