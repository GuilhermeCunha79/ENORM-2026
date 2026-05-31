package pt.isep.enorm.ref.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.domain.TopThreadComment;
import pt.isep.enorm.ref.service.TopThreadCommentService;

public abstract class GeneratedTopThreadCommentController {
    private final TopThreadCommentService service;

    protected GeneratedTopThreadCommentController(TopThreadCommentService service) {
        this.service = service;
    }

    @GetMapping
    public List<TopThreadComment> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<TopThreadComment> submit(@RequestBody TopThreadComment body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
