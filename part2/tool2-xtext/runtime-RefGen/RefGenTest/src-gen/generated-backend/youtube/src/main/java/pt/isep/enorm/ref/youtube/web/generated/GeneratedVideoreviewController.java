package pt.isep.enorm.ref.youtube.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.youtube.domain.Videoreview;
import pt.isep.enorm.ref.youtube.service.VideoreviewService;

public abstract class GeneratedVideoreviewController {
    private final VideoreviewService service;

    protected GeneratedVideoreviewController(VideoreviewService service) {
        this.service = service;
    }

    @GetMapping
    public List<Videoreview> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Videoreview> submit(@RequestBody Videoreview body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
