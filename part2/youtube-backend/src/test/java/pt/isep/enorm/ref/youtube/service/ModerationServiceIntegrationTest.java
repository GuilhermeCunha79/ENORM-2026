package pt.isep.enorm.ref.youtube.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pt.isep.enorm.ref.youtube.domain.Channel;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.VideoModerationCheck;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.CommentStatus;
import pt.isep.enorm.ref.youtube.domain.enums.ContentStatus;
import pt.isep.enorm.ref.youtube.domain.enums.Role;
import pt.isep.enorm.ref.youtube.domain.enums.VideoModerationResult;
import pt.isep.enorm.ref.youtube.repository.ChannelRepository;
import pt.isep.enorm.ref.youtube.repository.VideoModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.repository.YoutubeUserRepository;
import pt.isep.enorm.ref.youtube.service.projection.ModerationSimulationResult;

@SpringBootTest
class ModerationServiceIntegrationTest {

    @Autowired
    private ModerationService moderationService;

    @Autowired
    private YoutubeUserRepository youtubeUserRepository;

    @Autowired
    private ChannelRepository channelRepository;

    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private VideoModerationCheckRepository videoModerationCheckRepository;

    @Test
    void simulateVideoModerationPersistsCheckAndFlagsSpam() {
        YoutubeUser moderator = saveUser("yt-moderator", Role.MODERATOR);
        YoutubeUser creator = saveUser("yt-creator", Role.CREATOR);
        Channel channel = saveChannel(creator);
        Video video = saveVideo(channel, "Best setup", "Click here for a promo.");

        ModerationSimulationResult result = moderationService.simulateVideoModeration(moderator, video.getId());

        assertThat(result.targetType()).isEqualTo("VIDEO");
        assertThat(result.targetId()).isEqualTo(video.getId());
        assertThat(result.signal()).isEqualTo("spam-risk");
        assertThat(result.decision()).isEqualTo(VideoModerationResult.FLAGGED.name());
        assertThat(result.status()).isEqualTo(ContentStatus.FLAGGED.name());

        Video moderatedVideo = videoRepository.findById(video.getId()).orElseThrow();
        assertThat(moderatedVideo.getStatus()).isEqualTo(ContentStatus.FLAGGED);

        assertThat(videoModerationCheckRepository.findByVideoId(video.getId()))
            .extracting(VideoModerationCheck::getResult)
            .containsExactly(VideoModerationResult.FLAGGED);
    }

    private YoutubeUser saveUser(String username, Role role) {
        YoutubeUser user = new YoutubeUser();
        user.setUsername(username);
        user.setPassword("password");
        user.setRole(role);
        user.setRegistrationDate(LocalDate.now());
        return youtubeUserRepository.save(user);
    }

    private Channel saveChannel(YoutubeUser owner) {
        Channel channel = new Channel();
        channel.setName("moderation-channel");
        channel.setDescription("Channel used by moderation tests.");
        channel.setCreationDate(LocalDate.now());
        channel.setOwner(owner);
        return channelRepository.save(channel);
    }

    private Video saveVideo(Channel channel, String title, String description) {
        Video video = new Video();
        video.setTitle(title);
        video.setDescription(description);
        video.setUploadDate(LocalDate.now());
        video.setDuration(120);
        video.setCommentStatus(CommentStatus.ENABLED);
        video.setStatus(ContentStatus.ACTIVE);
        video.setCreationDate(LocalDate.now());
        video.setChannel(channel);
        return videoRepository.save(video);
    }
}
