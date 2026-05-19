package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.domain.Channel;
import pt.isep.enorm.ref.youtube.repository.ChannelRepository;

@Service
public class GeneratedChannelService {
    private final ChannelRepository repository;

    public GeneratedChannelService(ChannelRepository repository) {
        this.repository = repository;
    }

    public List<Channel> findAll() {
        return repository.findAll();
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
