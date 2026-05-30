package pt.isep.enorm.ref.youtube.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.youtube.domain.TopVideoComment;
import pt.isep.enorm.ref.youtube.service.TopVideoCommentService;

public abstract class GeneratedTopVideoCommentController {
    private final TopVideoCommentService service;

    protected GeneratedTopVideoCommentController(TopVideoCommentService service) {
        this.service = service;
    }

    @GetMapping
    public List<TopVideoComment> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<TopVideoComment> submit(@RequestBody TopVideoComment body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
