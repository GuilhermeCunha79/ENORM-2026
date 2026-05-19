package pt.isep.enorm.ref.reddit.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.reddit.domain.Postreport;
import pt.isep.enorm.ref.reddit.service.PostreportService;

public abstract class GeneratedPostreportController {
    private final PostreportService service;

    protected GeneratedPostreportController(PostreportService service) {
        this.service = service;
    }

    @GetMapping
    public List<Postreport> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Postreport> submit(@RequestBody Postreport body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
