package pt.isep.enorm.ref.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.domain.PostReport;
import pt.isep.enorm.ref.service.PostReportService;

public abstract class GeneratedPostReportController {
    private final PostReportService service;

    protected GeneratedPostReportController(PostReportService service) {
        this.service = service;
    }

    @GetMapping
    public List<PostReport> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<PostReport> submit(@RequestBody PostReport body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
