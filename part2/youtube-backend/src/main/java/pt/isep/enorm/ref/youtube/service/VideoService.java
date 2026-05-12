package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.youtube.repository.ChannelRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedVideoService;

@Service
public class VideoService extends GeneratedVideoService {

    public VideoService(VideoRepository videoRepository, ChannelRepository channelRepository) {
        super(videoRepository, channelRepository);
    }
}

