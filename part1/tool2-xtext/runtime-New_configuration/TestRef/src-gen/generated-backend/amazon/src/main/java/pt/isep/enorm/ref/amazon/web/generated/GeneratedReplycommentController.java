package pt.isep.enorm.ref.amazon.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.amazon.domain.Replycomment;
import pt.isep.enorm.ref.amazon.service.ReplycommentService;

public abstract class GeneratedReplycommentController {
    private final ReplycommentService service;

    protected GeneratedReplycommentController(ReplycommentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Replycomment> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Replycomment> submit(@RequestBody Replycomment body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
