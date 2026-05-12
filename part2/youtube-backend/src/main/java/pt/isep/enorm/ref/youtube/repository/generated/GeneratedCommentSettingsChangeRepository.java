package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.youtube.domain.CommentSettingsChange;

@NoRepositoryBean
public interface GeneratedCommentSettingsChangeRepository extends JpaRepository<CommentSettingsChange, Long> {

    List<CommentSettingsChange> findByVideoId(Long videoId);
}

