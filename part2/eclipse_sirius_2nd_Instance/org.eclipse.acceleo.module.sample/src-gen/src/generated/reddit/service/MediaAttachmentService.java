package generated.reddit.service;

import generated.reddit.dto.MediaAttachmentDto;
import generated.reddit.repository.MediaAttachmentRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MediaAttachmentService {
    private final MediaAttachmentRepository repository;

    public MediaAttachmentService(MediaAttachmentRepository repository) {
        this.repository = repository;
    }

    public List<MediaAttachmentDto> list() {
        return repository.findAll();
    }

    public MediaAttachmentDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MediaAttachment not found"));
    }

    public MediaAttachmentDto create(MediaAttachmentDto dto) {
        return repository.save(dto);
    }

    public MediaAttachmentDto update(String id, MediaAttachmentDto dto) {
        get(id);
        return repository.save(new MediaAttachmentDto(id , dto.type() , dto.url()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
