package pt.isep.enorm.ref.reddit.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.PostModerationCheck;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.Report;
import pt.isep.enorm.ref.reddit.domain.enums.ContentStatus;
import pt.isep.enorm.ref.reddit.domain.enums.PostModerationResult;
import pt.isep.enorm.ref.reddit.domain.enums.PostModerationType;
import pt.isep.enorm.ref.reddit.domain.enums.ReportStatus;
import pt.isep.enorm.ref.reddit.domain.enums.Role;
import pt.isep.enorm.ref.reddit.repository.CommentModerationCheckRepository;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.CommunityRuleRepository;
import pt.isep.enorm.ref.reddit.repository.PostModerationCheckRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.repository.ReportRepository;
import pt.isep.enorm.ref.reddit.service.projection.ModerationSimulationResult;

@ExtendWith(MockitoExtension.class)
class ModerationServiceTest {

    @Mock
    private PostModerationCheckRepository postModerationCheckRepository;

    @Mock
    private CommentModerationCheckRepository commentModerationCheckRepository;

    @Mock
    private CommunityRuleRepository communityRuleRepository;

    @Mock
    private PostRepository postRepository;

    @Mock
    private CommentRepository commentRepository;

    @Mock
    private ReportRepository reportRepository;

    private ModerationService moderationService;

    @BeforeEach
    void setUp() {
        moderationService = new ModerationService(
            postModerationCheckRepository,
            commentModerationCheckRepository,
            communityRuleRepository,
            postRepository,
            commentRepository,
            reportRepository
        );
    }

    @Test
    void reportedPostWithGeneratedBlockedKeywordIsFlagged() {
        RedditUser moderator = moderator();
        Post post = post("Question", "This includes a malware link");
        Report report = pendingReport(post);

        when(postRepository.findById(10L)).thenReturn(Optional.of(post));
        when(reportRepository.findFirstByPostIdAndStatusOrderByTimestampDesc(10L, ReportStatus.PENDING))
            .thenReturn(Optional.of(report));
        when(postModerationCheckRepository.save(any(PostModerationCheck.class))).thenAnswer(invocation -> {
            PostModerationCheck check = invocation.getArgument(0);
            check.setId(30L);
            return check;
        });

        ModerationSimulationResult result = moderationService.simulatePostModeration(moderator, 10L);

        assertThat(result.getDecision()).isEqualTo("FLAGGED");
        assertThat(result.getStatus()).isEqualTo("FLAGGED");
        assertThat(result.getMatchedKeywords()).containsExactly("malware");
        assertThat(report.getStatus()).isEqualTo(ReportStatus.REVIEWED);
        assertThat(report.getReviewedBy()).isSameAs(moderator);
        assertThat(post.getStatus()).isEqualTo(ContentStatus.FLAGGED);

        ArgumentCaptor<PostModerationCheck> checkCaptor = ArgumentCaptor.forClass(PostModerationCheck.class);
        verify(postModerationCheckRepository).save(checkCaptor.capture());
        assertThat(checkCaptor.getValue().getType()).isEqualTo(PostModerationType.CONTENT);
        assertThat(checkCaptor.getValue().getResult()).isEqualTo(PostModerationResult.FLAGGED);
    }

    @Test
    void postModerationIsSkippedWhenReportThresholdDoesNotMatch() {
        RedditUser moderator = moderator();
        Post post = post("Question", "clean content");

        when(postRepository.findById(10L)).thenReturn(Optional.of(post));
        when(reportRepository.findFirstByPostIdAndStatusOrderByTimestampDesc(10L, ReportStatus.PENDING))
            .thenReturn(Optional.empty());

        ModerationSimulationResult result = moderationService.simulatePostModeration(moderator, 10L);

        assertThat(result.getDecision()).isEqualTo("SKIPPED");
        assertThat(result.getTrigger()).isEqualTo("ON_REPORT_THRESHOLD");
        assertThat(post.getStatus()).isEqualTo(ContentStatus.ACTIVE);
        verify(postRepository, never()).save(any(Post.class));
        verify(postModerationCheckRepository, never()).save(any(PostModerationCheck.class));
    }

    private RedditUser moderator() {
        RedditUser user = new RedditUser();
        user.setId(1L);
        user.setRole(Role.MODERATOR);
        return user;
    }

    private Post post(String title, String description) {
        Post post = new Post();
        post.setId(10L);
        post.setTitle(title);
        post.setDescription(description);
        post.setStatus(ContentStatus.ACTIVE);
        return post;
    }

    private Report pendingReport(Post post) {
        Report report = new Report();
        report.setId(20L);
        report.setPost(post);
        report.setStatus(ReportStatus.PENDING);
        return report;
    }
}
