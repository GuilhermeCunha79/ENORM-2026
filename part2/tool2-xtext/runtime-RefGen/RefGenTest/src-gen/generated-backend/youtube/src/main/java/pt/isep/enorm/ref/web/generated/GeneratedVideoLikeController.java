package pt.isep.enorm.ref.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.domain.VideoLike;
import pt.isep.enorm.ref.service.VideoLikeService;

public abstract class GeneratedVideoLikeController {
    private final VideoLikeService service;

    protected GeneratedVideoLikeController(VideoLikeService service) {
        this.service = service;
    }

    @GetMapping
    public List<VideoLike> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<VideoLike> submit(@RequestBody VideoLike body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
