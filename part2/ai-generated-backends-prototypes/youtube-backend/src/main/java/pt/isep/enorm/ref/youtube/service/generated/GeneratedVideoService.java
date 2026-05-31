package pt.isep.enorm.ref.youtube.service.generated;

import java.time.LocalDate;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.youtube.domain.Channel;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.CommentStatus;
import pt.isep.enorm.ref.youtube.domain.enums.ContentStatus;
import pt.isep.enorm.ref.youtube.repository.ChannelRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedVideoService {

    private final VideoRepository videoRepository;
    private final ChannelRepository channelRepository;

    protected GeneratedVideoService(VideoRepository videoRepository, ChannelRepository channelRepository) {
        this.videoRepository = videoRepository;
        this.channelRepository = channelRepository;
    }

    public List<Video> listVideosForChannel(Long channelId) {
        loadChannel(channelId);
        return videoRepository.findByChannelIdOrderByUploadDateDesc(channelId);
    }

    public Video getVideo(Long videoId) {
        return loadVideo(videoId);
    }

    @Transactional
    public Video createVideo(YoutubeUser owner, Long channelId, Video request) {
        if (owner == null) {
            throw new IllegalArgumentException("Owner is required.");
        }

        validateVideoRequest(request);
        Channel channel = loadChannel(channelId);

        if (!channel.getOwner().getId().equals(owner.getId())) {
            throw new IllegalStateException("Only the channel owner can upload videos.");
        }

        Video video = new Video();
        video.setChannel(channel);
        video.setTitle(request.getTitle());
        video.setDescription(request.getDescription());
        video.setDuration(request.getDuration());
        video.setUploadDate(request.getUploadDate() == null ? LocalDate.now() : request.getUploadDate());
        video.setCreationDate(request.getCreationDate() == null ? LocalDate.now() : request.getCreationDate());
        video.setCommentStatus(request.getCommentStatus() == null ? CommentStatus.ENABLED : request.getCommentStatus());
        video.setStatus(request.getStatus() == null ? ContentStatus.ACTIVE : request.getStatus());

        return videoRepository.save(video);
    }

    @Transactional
    public Video updateVideo(Long videoId, Video request) {
        Video video = loadVideo(videoId);

        if (request.getTitle() != null && !request.getTitle().isBlank()) {
            video.setTitle(request.getTitle());
        }

        if (request.getDescription() != null && !request.getDescription().isBlank()) {
            video.setDescription(request.getDescription());
        }

        if (request.getDuration() != null && request.getDuration() > 0) {
            video.setDuration(request.getDuration());
        }

        if (request.getUploadDate() != null) {
            video.setUploadDate(request.getUploadDate());
        }

        if (request.getCommentStatus() != null) {
            video.setCommentStatus(request.getCommentStatus());
        }

        if (request.getStatus() != null) {
            video.setStatus(request.getStatus());
        }

        return videoRepository.save(video);
    }

    @Transactional
    public void deleteVideo(Long videoId) {
        Video video = loadVideo(videoId);
        videoRepository.delete(video);
    }

    private Channel loadChannel(Long channelId) {
        return channelRepository.findById(channelId)
            .orElseThrow(() -> new ResourceNotFoundException("Channel '%s' was not found.".formatted(channelId)));
    }

    private Video loadVideo(Long videoId) {
        return videoRepository.findById(videoId)
            .orElseThrow(() -> new ResourceNotFoundException("Video '%s' was not found.".formatted(videoId)));
    }

    private void validateVideoRequest(Video request) {
        if (request == null) {
            throw new IllegalArgumentException("Video payload is required.");
        }

        if (request.getTitle() == null || request.getTitle().isBlank()) {
            throw new IllegalArgumentException("Video title is required.");
        }

        if (request.getDescription() == null || request.getDescription().isBlank()) {
            throw new IllegalArgumentException("Video description is required.");
        }

        if (request.getDuration() == null || request.getDuration() <= 0) {
            throw new IllegalArgumentException("Video duration must be greater than zero.");
        }
    }
}

