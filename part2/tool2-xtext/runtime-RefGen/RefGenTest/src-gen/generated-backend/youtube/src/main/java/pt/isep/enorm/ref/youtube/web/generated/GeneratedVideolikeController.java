package pt.isep.enorm.ref.youtube.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.youtube.domain.Videolike;
import pt.isep.enorm.ref.youtube.service.VideolikeService;

public abstract class GeneratedVideolikeController {
    private final VideolikeService service;

    protected GeneratedVideolikeController(VideolikeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Videolike> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Videolike> submit(@RequestBody Videolike body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
