package pt.isep.enorm.ref.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.domain.ReplyComment;
import pt.isep.enorm.ref.service.ReplyCommentService;

public abstract class GeneratedReplyCommentController {
    private final ReplyCommentService service;

    protected GeneratedReplyCommentController(ReplyCommentService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReplyComment> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<ReplyComment> submit(@RequestBody ReplyComment body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
