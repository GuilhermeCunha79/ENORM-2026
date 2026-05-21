package pt.isep.enorm.ref.reddit.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.reddit.domain.Commentvote;
import pt.isep.enorm.ref.reddit.service.CommentvoteService;

public abstract class GeneratedCommentvoteController {
    private final CommentvoteService service;

    protected GeneratedCommentvoteController(CommentvoteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Commentvote> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Commentvote> submit(@RequestBody Commentvote body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
