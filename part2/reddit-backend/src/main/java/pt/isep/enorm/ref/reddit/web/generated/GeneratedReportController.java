package pt.isep.enorm.ref.reddit.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.reddit.domain.Report;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.ReportStatus;
import pt.isep.enorm.ref.reddit.service.ReportService;

public abstract class GeneratedReportController {

    private final ReportService reportService;

    protected GeneratedReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/reports")
    public List<Report> listReports(@RequestParam(required = false) ReportStatus status) {
        return reportService.listReports(status);
    }

    @PostMapping("/reports")
    public ResponseEntity<Report> createReport(
        @AuthenticationPrincipal RedditUser currentUser,
        @RequestParam(required = false) Long postId,
        @RequestParam(required = false) Long commentId,
        @Valid @RequestBody Report request
    ) {
        Report report = reportService.createReport(currentUser, postId, commentId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(report);
    }
}



