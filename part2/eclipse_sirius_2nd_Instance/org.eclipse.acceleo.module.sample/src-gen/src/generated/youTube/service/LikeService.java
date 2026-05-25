package generated.youTube.service;

import generated.youTube.dto.LikeDto;
import generated.youTube.repository.LikeRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class LikeService {
    private final LikeRepository repository;

    public LikeService(LikeRepository repository) {
        this.repository = repository;
    }

    public List<LikeDto> list() {
        return repository.findAll();
    }

    public LikeDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Like not found"));
    }

    public LikeDto create(LikeDto dto) {
        return repository.save(dto);
    }

    public LikeDto update(String id, LikeDto dto) {
        get(id);
        return repository.save(new LikeDto(id , dto.value() , dto.timestamp()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
