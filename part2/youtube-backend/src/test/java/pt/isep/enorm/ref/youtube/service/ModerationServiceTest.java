package pt.isep.enorm.ref.youtube.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import pt.isep.enorm.ref.youtube.domain.Comment;
import pt.isep.enorm.ref.youtube.domain.CommentModerationCheck;
import pt.isep.enorm.ref.youtube.domain.Report;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.VideoModerationCheck;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.CommentModerationResult;
import pt.isep.enorm.ref.youtube.domain.enums.ContentStatus;
import pt.isep.enorm.ref.youtube.domain.enums.ReportStatus;
import pt.isep.enorm.ref.youtube.domain.enums.Role;
import pt.isep.enorm.ref.youtube.domain.enums.VideoModerationResult;
import pt.isep.enorm.ref.youtube.domain.enums.VideoModerationType;
import pt.isep.enorm.ref.youtube.repository.CommentModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.CommentSettingsChangeRepository;
import pt.isep.enorm.ref.youtube.repository.ReportRepository;
import pt.isep.enorm.ref.youtube.repository.VideoModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.projection.ModerationSimulationResult;

@ExtendWith(MockitoExtension.class)
class ModerationServiceTest {

    @Mock
    private VideoModerationCheckRepository videoModerationCheckRepository;

    @Mock
    private CommentModerationCheckRepository commentModerationCheckRepository;

    @Mock
    private CommentSettingsChangeRepository commentSettingsChangeRepository;

    @Mock
    private VideoRepository videoRepository;

    @Mock
    private CommentRepository commentRepository;

    @Mock
    private ReportRepository reportRepository;

    private ModerationService moderationService;

    @BeforeEach
    void setUp() {
        moderationService = new ModerationService(
            videoModerationCheckRepository,
            commentModerationCheckRepository,
            commentSettingsChangeRepository,
            videoRepository,
            commentRepository,
            reportRepository
        );
    }

    @Test
    void videoWithGeneratedCopyrightKeywordIsFlagged() {
        Video video = video("Reupload", "copyright material");
        when(videoRepository.findById(10L)).thenReturn(Optional.of(video));
        when(videoModerationCheckRepository.save(any(VideoModerationCheck.class))).thenAnswer(invocation -> {
            VideoModerationCheck check = invocation.getArgument(0);
            check.setId(30L);
            return check;
        });

        ModerationSimulationResult result = moderationService.simulateVideoModeration(moderator(), 10L);

        assertThat(result.getDecision()).isEqualTo("FLAGGED");
        assertThat(result.getStatus()).isEqualTo("FLAGGED");
        assertThat(result.getMatchedKeywords()).containsExactly("copyright", "reupload");
        assertThat(video.getStatus()).isEqualTo(ContentStatus.FLAGGED);

        ArgumentCaptor<VideoModerationCheck> checkCaptor = ArgumentCaptor.forClass(VideoModerationCheck.class);
        verify(videoModerationCheckRepository).save(checkCaptor.capture());
        assertThat(checkCaptor.getValue().getType()).isEqualTo(VideoModerationType.COPYRIGHT);
        assertThat(checkCaptor.getValue().getResult()).isEqualTo(VideoModerationResult.FLAGGED);
    }

    @Test
    void pendingCommentReportIsHiddenByReportPolicy() {
        Comment comment = comment("clean");
        Report report = new Report();
        report.setId(20L);
        report.setComment(comment);
        report.setStatus(ReportStatus.PENDING);

        when(reportRepository.findByStatus(ReportStatus.PENDING)).thenReturn(List.of(report));
        when(commentModerationCheckRepository.save(any(CommentModerationCheck.class))).thenAnswer(invocation -> {
            CommentModerationCheck check = invocation.getArgument(0);
            check.setId(40L);
            return check;
        });

        List<ModerationSimulationResult> results = moderationService.simulateReportModeration(moderator());

        assertThat(results).hasSize(1);
        assertThat(results.get(0).getDecision()).isEqualTo("HIDDEN");
        assertThat(results.get(0).getStatus()).isEqualTo("REMOVED");
        assertThat(comment.getStatus()).isEqualTo(ContentStatus.REMOVED);
        assertThat(report.getStatus()).isEqualTo(ReportStatus.REMOVED);

        ArgumentCaptor<CommentModerationCheck> checkCaptor = ArgumentCaptor.forClass(CommentModerationCheck.class);
        verify(commentModerationCheckRepository).save(checkCaptor.capture());
        assertThat(checkCaptor.getValue().getResult()).isEqualTo(CommentModerationResult.HIDDEN);
    }

    private YoutubeUser moderator() {
        YoutubeUser user = new YoutubeUser();
        user.setRole(Role.MODERATOR);
        return user;
    }

    private Video video(String title, String description) {
        Video video = new Video();
        video.setId(10L);
        video.setTitle(title);
        video.setDescription(description);
        video.setStatus(ContentStatus.ACTIVE);
        return video;
    }

    private Comment comment(String text) {
        Comment comment = new Comment();
        comment.setId(11L);
        comment.setText(text);
        comment.setStatus(ContentStatus.ACTIVE);
        return comment;
    }
}
