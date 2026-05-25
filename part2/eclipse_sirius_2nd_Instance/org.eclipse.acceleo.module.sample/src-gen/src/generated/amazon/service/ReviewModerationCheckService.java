package generated.amazon.service;

import generated.amazon.dto.ReviewModerationCheckDto;
import generated.amazon.repository.ReviewModerationCheckRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ReviewModerationCheckService {
    private final ReviewModerationCheckRepository repository;

    public ReviewModerationCheckService(ReviewModerationCheckRepository repository) {
        this.repository = repository;
    }

    public List<ReviewModerationCheckDto> list() {
        return repository.findAll();
    }

    public ReviewModerationCheckDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReviewModerationCheck not found"));
    }

    public ReviewModerationCheckDto create(ReviewModerationCheckDto dto) {
        return repository.save(dto);
    }

    public ReviewModerationCheckDto update(String id, ReviewModerationCheckDto dto) {
        get(id);
        return repository.save(new ReviewModerationCheckDto(id , dto.reason() , dto.result() , dto.timestamp()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
