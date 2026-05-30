package generated.youTube.service.generated;

import generated.youTube.domain.Channel;
import generated.youTube.repository.generated.GeneratedChannelRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedChannelService {
    protected final GeneratedChannelRepository repository;

    public GeneratedChannelService(GeneratedChannelRepository repository) {
        this.repository = repository;
    }

    public List<Channel> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public Channel get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Channel not found"));
    }

    public Channel create(Channel entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public Channel update(String id, Channel entity) {
        Channel current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Channel not found"));
        current.setName(entity.getName());
        current.setDescription(entity.getDescription());
        current.setCreationDate(entity.getCreationDate());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Channel not found");
        }
        repository.deleteById(id);
    }

}
