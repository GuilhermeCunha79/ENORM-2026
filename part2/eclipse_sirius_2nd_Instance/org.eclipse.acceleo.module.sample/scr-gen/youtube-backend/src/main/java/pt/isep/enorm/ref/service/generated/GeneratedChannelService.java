package pt.isep.enorm.ref.service.generated;

import pt.isep.enorm.ref.domain.Channel;
import pt.isep.enorm.ref.repository.generated.GeneratedChannelRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GeneratedChannelService {
    protected final GeneratedChannelRepository repository;

    public GeneratedChannelService(GeneratedChannelRepository repository) {
        this.repository = repository;
    }

    public List<Channel> list() {
        return repository.findAll();
    }

    public Channel get(String id) {
        return repository.findById(toLong(id))
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Channel '" + id + "' was not found."));
    }

    public Channel create(Channel entity) {
        return repository.save(entity);
    }

    public Channel update(String id, Channel entity) {
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
