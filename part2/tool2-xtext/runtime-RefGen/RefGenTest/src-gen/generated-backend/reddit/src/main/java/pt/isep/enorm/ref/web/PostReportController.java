package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.PostReportService;
import pt.isep.enorm.ref.web.generated.GeneratedPostReportController;

@RestController
@RequestMapping("/api/post-reports")
public class PostReportController extends GeneratedPostReportController {
    public PostReportController(PostReportService service) {
        super(service);
    }
}
