package pt.isep.enorm.ref.youtube.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.youtube.domain.Replyvideocomment;
import pt.isep.enorm.ref.youtube.service.ReplyvideocommentService;

public abstract class GeneratedReplyvideocommentController {
    private final ReplyvideocommentService service;

    protected GeneratedReplyvideocommentController(ReplyvideocommentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Replyvideocomment> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Replyvideocomment> submit(@RequestBody Replyvideocomment body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
