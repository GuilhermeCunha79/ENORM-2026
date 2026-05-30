package pt.isep.enorm.ref.youtube.service.generated;

import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.repository.generated.GeneratedVideoRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GeneratedVideoService {
    protected final GeneratedVideoRepository repository;

    public GeneratedVideoService(GeneratedVideoRepository repository) {
        this.repository = repository;
    }

    public List<Video> list() {
        return repository.findAll();
    }

    public Video get(String id) {
        return repository.findById(toLong(id))
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Video '" + id + "' was not found."));
    }

    public Video create(Video entity) {
        return repository.save(entity);
    }

    public Video update(String id, Video entity) {
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
