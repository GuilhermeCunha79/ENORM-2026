package generated.youTube.api;

import generated.youTube.dto.ChannelDto;
import generated.youTube.service.ChannelService;
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
@RequestMapping("/api/channels")
public class ChannelController {
    private final ChannelService service;

    public ChannelController(ChannelService service) {
        this.service = service;
    }

    @GetMapping
    public List<ChannelDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ChannelDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ChannelDto create(@RequestBody ChannelDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public ChannelDto update(@PathVariable String id, @RequestBody ChannelDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/{id}/channelContainsVideo")
    public String videos(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for channelContainsVideo";
    }
}
