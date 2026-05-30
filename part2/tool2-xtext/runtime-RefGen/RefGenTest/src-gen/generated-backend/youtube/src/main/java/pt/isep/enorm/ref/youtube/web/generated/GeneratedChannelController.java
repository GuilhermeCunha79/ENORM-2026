package pt.isep.enorm.ref.youtube.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import pt.isep.enorm.ref.youtube.domain.Channel;
import pt.isep.enorm.ref.youtube.service.ChannelService;

public abstract class GeneratedChannelController {
    private final ChannelService service;

    protected GeneratedChannelController(ChannelService service) {
        this.service = service;
    }

    @GetMapping
    public List<Channel> list(
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false, defaultValue = "ASC") String direction) {
        return service.findAll(sortBy, direction);
    }

    @GetMapping("/{id}")
    public Channel get(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public ResponseEntity<Channel> create(@RequestBody Channel body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(body));
    }
}
