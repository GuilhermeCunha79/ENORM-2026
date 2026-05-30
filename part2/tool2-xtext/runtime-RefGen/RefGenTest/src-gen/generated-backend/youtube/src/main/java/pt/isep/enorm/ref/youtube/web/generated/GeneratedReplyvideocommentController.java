package pt.isep.enorm.ref.youtube.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.youtube.domain.ReplyVideoComment;
import pt.isep.enorm.ref.youtube.service.ReplyVideoCommentService;

public abstract class GeneratedReplyVideoCommentController {
    private final ReplyVideoCommentService service;

    protected GeneratedReplyVideoCommentController(ReplyVideoCommentService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReplyVideoComment> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<ReplyVideoComment> submit(@RequestBody ReplyVideoComment body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
