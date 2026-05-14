package pt.isep.enorm.ref.reddit.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.reddit.domain.Post;

@NoRepositoryBean
public interface GeneratedPostRepository extends JpaRepository<Post, Long> {

    List<Post> findBySubredditIdOrderByUploadDateDesc(Long subredditId);
}



