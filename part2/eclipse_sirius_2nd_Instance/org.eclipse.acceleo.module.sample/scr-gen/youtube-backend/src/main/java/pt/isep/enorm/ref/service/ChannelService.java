package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.service.generated.GeneratedChannelService;
import pt.isep.enorm.ref.repository.ChannelRepository;
import org.springframework.stereotype.Service;

@Service
public class ChannelService extends GeneratedChannelService {
    public ChannelService(ChannelRepository repository) {
        super(repository);
    }
}
