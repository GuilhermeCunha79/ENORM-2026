package pt.isep.enorm.ref.reddit.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.reddit.domain.Postvote;
import pt.isep.enorm.ref.reddit.service.PostvoteService;

public abstract class GeneratedPostvoteController {
    private final PostvoteService service;

    protected GeneratedPostvoteController(PostvoteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Postvote> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Postvote> submit(@RequestBody Postvote body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
