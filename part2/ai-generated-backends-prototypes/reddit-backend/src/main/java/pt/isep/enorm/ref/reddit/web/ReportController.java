package pt.isep.enorm.ref.reddit.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.reddit.service.ReportService;
import pt.isep.enorm.ref.reddit.web.generated.GeneratedReportController;

@RestController
@RequestMapping("/api")
public class ReportController extends GeneratedReportController {

    public ReportController(ReportService reportService) {
        super(reportService);
    }
}

