package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.youtube.domain.Like;

@NoRepositoryBean
public interface GeneratedLikeRepository extends JpaRepository<Like, Long> {

    List<Like> findByVideoId(Long videoId);

    List<Like> findByCommentId(Long commentId);

    boolean existsByUserIdAndVideoId(Long userId, Long videoId);

    boolean existsByUserIdAndCommentId(Long userId, Long commentId);
}

