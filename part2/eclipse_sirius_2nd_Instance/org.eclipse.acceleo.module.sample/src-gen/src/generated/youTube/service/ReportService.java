package generated.youTube.service;

import generated.youTube.dto.ReportDto;
import generated.youTube.repository.ReportRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ReportService {
    private final ReportRepository repository;

    public ReportService(ReportRepository repository) {
        this.repository = repository;
    }

    public List<ReportDto> list() {
        return repository.findAll();
    }

    public ReportDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Report not found"));
    }

    public ReportDto create(ReportDto dto) {
        return repository.save(dto);
    }

    public ReportDto update(String id, ReportDto dto) {
        get(id);
        return repository.save(new ReportDto(id , dto.reason() , dto.status() , dto.timestamp()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
