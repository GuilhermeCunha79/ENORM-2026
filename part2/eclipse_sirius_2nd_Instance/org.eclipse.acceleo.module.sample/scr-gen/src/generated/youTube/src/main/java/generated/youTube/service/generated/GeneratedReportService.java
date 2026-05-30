package generated.youTube.service.generated;

import generated.youTube.domain.Report;
import generated.youTube.repository.generated.GeneratedReportRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedReportService {
    protected final GeneratedReportRepository repository;

    public GeneratedReportService(GeneratedReportRepository repository) {
        this.repository = repository;
    }

    public List<Report> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public Report get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Report not found"));
    }

    public Report create(Report entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public Report update(String id, Report entity) {
        Report current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Report not found"));
        current.setReason(entity.getReason());
        current.setStatus(entity.getStatus());
        current.setTimestamp(entity.getTimestamp());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Report not found");
        }
        repository.deleteById(id);
    }

}
