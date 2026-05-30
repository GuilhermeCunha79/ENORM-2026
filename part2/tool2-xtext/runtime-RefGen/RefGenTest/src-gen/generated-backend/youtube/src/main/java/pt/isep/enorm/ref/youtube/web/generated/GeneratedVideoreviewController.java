package pt.isep.enorm.ref.youtube.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.youtube.domain.VideoReview;
import pt.isep.enorm.ref.youtube.service.VideoReviewService;

public abstract class GeneratedVideoReviewController {
    private final VideoReviewService service;

    protected GeneratedVideoReviewController(VideoReviewService service) {
        this.service = service;
    }

    @GetMapping
    public List<VideoReview> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<VideoReview> submit(@RequestBody VideoReview body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
