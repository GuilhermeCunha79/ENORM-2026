package pt.isep.enorm.ref.reddit.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.PostModerationCheck;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.Subreddit;
import pt.isep.enorm.ref.reddit.domain.enums.CommentStatus;
import pt.isep.enorm.ref.reddit.domain.enums.ContentStatus;
import pt.isep.enorm.ref.reddit.domain.enums.PostModerationResult;
import pt.isep.enorm.ref.reddit.domain.enums.Role;
import pt.isep.enorm.ref.reddit.repository.PostModerationCheckRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.repository.RedditUserRepository;
import pt.isep.enorm.ref.reddit.repository.SubredditRepository;
import pt.isep.enorm.ref.reddit.service.projection.ModerationSimulationResult;

@SpringBootTest
class ModerationServiceIntegrationTest {

    @Autowired
    private ModerationService moderationService;

    @Autowired
    private RedditUserRepository redditUserRepository;

    @Autowired
    private SubredditRepository subredditRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostModerationCheckRepository postModerationCheckRepository;

    @Test
    void simulatePostModerationPersistsCheckAndFlagsSpam() {
        RedditUser moderator = saveUser("rd-moderator", Role.MODERATOR);
        RedditUser creator = saveUser("rd-creator", Role.CREATOR);
        Subreddit subreddit = saveSubreddit(creator);
        Post post = savePost(subreddit, "Giveaway", "Buy now and click here.");

        ModerationSimulationResult result = moderationService.simulatePostModeration(moderator, post.getId());

        assertThat(result.targetType()).isEqualTo("POST");
        assertThat(result.targetId()).isEqualTo(post.getId());
        assertThat(result.signal()).isEqualTo("spam-risk");
        assertThat(result.decision()).isEqualTo(PostModerationResult.FLAGGED.name());
        assertThat(result.status()).isEqualTo(ContentStatus.FLAGGED.name());

        Post moderatedPost = postRepository.findById(post.getId()).orElseThrow();
        assertThat(moderatedPost.getStatus()).isEqualTo(ContentStatus.FLAGGED);

        assertThat(postModerationCheckRepository.findByPostId(post.getId()))
            .extracting(PostModerationCheck::getResult)
            .containsExactly(PostModerationResult.FLAGGED);
    }

    private RedditUser saveUser(String username, Role role) {
        RedditUser user = new RedditUser();
        user.setUsername(username);
        user.setPassword("password");
        user.setRole(role);
        user.setRegistrationDate(LocalDate.now());
        return redditUserRepository.save(user);
    }

    private Subreddit saveSubreddit(RedditUser owner) {
        Subreddit subreddit = new Subreddit();
        subreddit.setName("moderation-subreddit");
        subreddit.setDescription("Subreddit used by moderation tests.");
        subreddit.setCreationDate(LocalDate.now());
        subreddit.setOwner(owner);
        return subredditRepository.save(subreddit);
    }

    private Post savePost(Subreddit subreddit, String title, String description) {
        Post post = new Post();
        post.setTitle(title);
        post.setDescription(description);
        post.setUploadDate(LocalDate.now());
        post.setDuration(120);
        post.setCommentStatus(CommentStatus.ENABLED);
        post.setStatus(ContentStatus.ACTIVE);
        post.setCreationDate(LocalDate.now());
        post.setSubreddit(subreddit);
        return postRepository.save(post);
    }
}
