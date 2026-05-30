package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.repository.ChannelRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedVideoService;

@Service
public class VideoService extends GeneratedVideoService {

    private final ModerationService moderationService;

    public VideoService(
        VideoRepository videoRepository,
        ChannelRepository channelRepository,
        ModerationService moderationService
    ) {
        super(videoRepository, channelRepository);
        this.moderationService = moderationService;
    }

    @Override
    @Transactional
    public Video createVideo(YoutubeUser owner, Long channelId, Video request) {
        Video video = super.createVideo(owner, channelId, request);
        moderationService.moderateAutomaticallyOnVideoCreated(video);
        return video;
    }
}

