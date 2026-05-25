package generated.youTube.service;

import generated.youTube.dto.CommentSettingsChangeDto;
import generated.youTube.repository.CommentSettingsChangeRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CommentSettingsChangeService {
    private final CommentSettingsChangeRepository repository;

    public CommentSettingsChangeService(CommentSettingsChangeRepository repository) {
        this.repository = repository;
    }

    public List<CommentSettingsChangeDto> list() {
        return repository.findAll();
    }

    public CommentSettingsChangeDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommentSettingsChange not found"));
    }

    public CommentSettingsChangeDto create(CommentSettingsChangeDto dto) {
        return repository.save(dto);
    }

    public CommentSettingsChangeDto update(String id, CommentSettingsChangeDto dto) {
        get(id);
        return repository.save(new CommentSettingsChangeDto(id , dto.newStatus() , dto.timestamp()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
