package pt.isep.enorm.ref.youtube.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.youtube.domain.Topvideocomment;
import pt.isep.enorm.ref.youtube.service.TopvideocommentService;

public abstract class GeneratedTopvideocommentController {
    private final TopvideocommentService service;

    protected GeneratedTopvideocommentController(TopvideocommentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Topvideocomment> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Topvideocomment> submit(@RequestBody Topvideocomment body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
