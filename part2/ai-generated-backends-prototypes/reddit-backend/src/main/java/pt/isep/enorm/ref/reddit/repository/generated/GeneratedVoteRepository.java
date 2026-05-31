package pt.isep.enorm.ref.reddit.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.reddit.domain.Vote;

@NoRepositoryBean
public interface GeneratedVoteRepository extends JpaRepository<Vote, Long> {

    List<Vote> findByPostId(Long postId);

    List<Vote> findByCommentId(Long commentId);

    boolean existsByUserIdAndPostId(Long userId, Long postId);

    boolean existsByUserIdAndCommentId(Long userId, Long commentId);
}



