package generated.youTube.service;

import generated.youTube.dto.ContentDto;
import generated.youTube.repository.ContentRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ContentService {
    private final ContentRepository repository;

    public ContentService(ContentRepository repository) {
        this.repository = repository;
    }

    public List<ContentDto> list() {
        return repository.findAll();
    }

    public ContentDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));
    }

    public ContentDto create(ContentDto dto) {
        return repository.save(dto);
    }

    public ContentDto update(String id, ContentDto dto) {
        get(id);
        return repository.save(new ContentDto(id , dto.creationDate() , dto.status()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
