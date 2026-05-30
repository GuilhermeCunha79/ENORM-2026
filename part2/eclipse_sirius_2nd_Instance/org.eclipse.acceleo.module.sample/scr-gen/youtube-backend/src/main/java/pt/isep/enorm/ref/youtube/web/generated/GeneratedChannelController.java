package pt.isep.enorm.ref.youtube.web.generated;

import pt.isep.enorm.ref.youtube.domain.Channel;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedChannelService;
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
public class GeneratedChannelController {
    private final GeneratedChannelService service;

    public GeneratedChannelController(GeneratedChannelService service) { this.service = service; }

    @GetMapping public List<Channel> list() { return service.list(); }
    @GetMapping("/{channelId}") public Channel get(@PathVariable String channelId) { return service.get(channelId); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Channel create(@RequestBody Channel payload) { return service.create(payload); }
    @PutMapping("/{channelId}") public Channel update(@PathVariable String channelId, @RequestBody Channel payload) { return service.update(channelId, payload); }
    @DeleteMapping("/{channelId}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable String channelId) { service.delete(channelId); }

    @PostMapping("/{channelId}/videos")
    @ResponseStatus(HttpStatus.CREATED)
    public void createVideo(@PathVariable String channelId, @RequestBody Object payload) { }
}
