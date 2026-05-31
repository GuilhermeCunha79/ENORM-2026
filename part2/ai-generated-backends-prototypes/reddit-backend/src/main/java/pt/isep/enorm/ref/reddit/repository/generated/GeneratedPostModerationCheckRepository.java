package pt.isep.enorm.ref.reddit.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.reddit.domain.PostModerationCheck;

@NoRepositoryBean
public interface GeneratedPostModerationCheckRepository extends JpaRepository<PostModerationCheck, Long> {

    List<PostModerationCheck> findByPostId(Long postId);
}



