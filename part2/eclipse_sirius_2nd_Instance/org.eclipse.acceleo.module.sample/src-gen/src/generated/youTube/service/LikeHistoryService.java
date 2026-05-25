package generated.youTube.service;

import generated.youTube.dto.LikeHistoryDto;
import generated.youTube.repository.LikeHistoryRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class LikeHistoryService {
    private final LikeHistoryRepository repository;

    public LikeHistoryService(LikeHistoryRepository repository) {
        this.repository = repository;
    }

    public List<LikeHistoryDto> list() {
        return repository.findAll();
    }

    public LikeHistoryDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "LikeHistory not found"));
    }

    public LikeHistoryDto create(LikeHistoryDto dto) {
        return repository.save(dto);
    }

    public LikeHistoryDto update(String id, LikeHistoryDto dto) {
        get(id);
        return repository.save(new LikeHistoryDto(id , dto.action() , dto.timestamp()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
