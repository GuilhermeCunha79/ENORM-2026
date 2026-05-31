package pt.isep.enorm.ref.reddit.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.reddit.domain.Comment;

@NoRepositoryBean
public interface GeneratedCommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPostIdOrderByCreationDateAsc(Long postId);
}



