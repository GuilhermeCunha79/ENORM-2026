package pt.isep.enorm.ref.reddit.service.generated;

import pt.isep.enorm.ref.reddit.domain.Report;
import pt.isep.enorm.ref.reddit.domain.enums.ReportStatus;
import java.time.Instant;
import pt.isep.enorm.ref.reddit.repository.generated.GeneratedReportRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GeneratedReportService {
    protected final GeneratedReportRepository repository;

    public GeneratedReportService(GeneratedReportRepository repository) {
        this.repository = repository;
    }

    public List<Report> list() {
        return repository.findAll();
    }

    public Report get(String id) {
        return repository.findById(toLong(id))
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Report '" + id + "' was not found."));
    }

    public Report create(Report entity) {
        if (entity.getStatus() == null) {
            entity.setStatus(ReportStatus.PENDING);
        }
        if (entity.getTimestamp() == null) {
            entity.setTimestamp(Instant.now());
        }
        return repository.save(entity);
    }

    public Report update(String id, Report entity) {
        entity.setId(toLong(id));
        return repository.save(entity);
    }

    public void delete(String id) {
        repository.deleteById(toLong(id));
    }

    private Long toLong(String id) {
        try {
            return Long.valueOf(id);
        } catch (NumberFormatException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid numeric id: " + id);
        }
    }
}
