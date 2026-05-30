package pt.isep.enorm.ref.youtube.web.generated;

import pt.isep.enorm.ref.youtube.domain.Report;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedReportService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reports")
public class GeneratedReportController {
    private final GeneratedReportService service;

    public GeneratedReportController(GeneratedReportService service) { this.service = service; }

    @GetMapping public List<Report> list(@RequestParam(required = false) String status) { return service.list(); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Report create(@RequestParam(required = false) String videoId, @RequestParam(required = false) String commentId, @RequestBody Report payload) { return service.create(payload); }
}
