package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.ChannelRepository;
import pt.isep.enorm.ref.service.generated.GeneratedChannelService;

@Service
public class ChannelService extends GeneratedChannelService {
    public ChannelService(ChannelRepository repository) {
        super(repository);
    }
}
