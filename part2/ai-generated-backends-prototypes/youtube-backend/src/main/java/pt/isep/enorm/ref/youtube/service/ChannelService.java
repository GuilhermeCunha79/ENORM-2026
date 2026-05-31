package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.youtube.repository.ChannelRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedChannelService;

@Service
public class ChannelService extends GeneratedChannelService {

    public ChannelService(ChannelRepository channelRepository) {
        super(channelRepository);
    }
}

