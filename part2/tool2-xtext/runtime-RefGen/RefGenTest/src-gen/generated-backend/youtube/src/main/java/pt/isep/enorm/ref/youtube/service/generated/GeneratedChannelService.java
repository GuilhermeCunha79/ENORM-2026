package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.domain.Channel;
import pt.isep.enorm.ref.youtube.repository.ChannelRepository;

@Service
public class GeneratedChannelService {
    private final ChannelRepository repository;

    public GeneratedChannelService(ChannelRepository repository) {
        this.repository = repository;
    }

    /** Fase G: optional sorting driven by SortingPolicy (sortBy = entity property, direction = ASC|DESC). */
    public List<Channel> findAll(String sortBy, String direction) {
        if (sortBy == null || sortBy.isBlank()) {
            return repository.findAll();
        }
        Sort.Direction dir = "DESC".equalsIgnoreCase(direction) ? Sort.Direction.DESC : Sort.Direction.ASC;
        try {
            return repository.findAll(Sort.by(dir, sortBy));
        } catch (RuntimeException ex) {
            return repository.findAll();
        }
    }

    public Channel findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Channel not found: " + id));
    }

    public Channel create(Channel entity) {
        return repository.save(entity);
    }

    /** Override in manual ChannelService for scenario-specific rules. */
    protected void beforeCreate(Channel entity) {
    }
}
