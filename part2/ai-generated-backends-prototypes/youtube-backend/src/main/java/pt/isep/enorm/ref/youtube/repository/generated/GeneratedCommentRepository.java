package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.youtube.domain.Comment;

@NoRepositoryBean
public interface GeneratedCommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByVideoIdOrderByCreationDateAsc(Long videoId);
}

