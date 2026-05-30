package pt.isep.enorm.ref.youtube.service;

import pt.isep.enorm.ref.youtube.service.generated.GeneratedChannelService;
import pt.isep.enorm.ref.youtube.repository.ChannelRepository;
import org.springframework.stereotype.Service;

@Service
public class ChannelService extends GeneratedChannelService {
    public ChannelService(ChannelRepository repository) {
        super(repository);
    }
}
