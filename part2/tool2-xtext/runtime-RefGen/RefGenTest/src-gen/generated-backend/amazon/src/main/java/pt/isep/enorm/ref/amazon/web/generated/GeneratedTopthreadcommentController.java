package pt.isep.enorm.ref.amazon.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.amazon.domain.Topthreadcomment;
import pt.isep.enorm.ref.amazon.service.TopthreadcommentService;

public abstract class GeneratedTopthreadcommentController {
    private final TopthreadcommentService service;

    protected GeneratedTopthreadcommentController(TopthreadcommentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Topthreadcomment> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Topthreadcomment> submit(@RequestBody Topthreadcomment body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
