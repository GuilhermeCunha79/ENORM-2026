package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.youtube.domain.VideoModerationCheck;

@NoRepositoryBean
public interface GeneratedVideoModerationCheckRepository extends JpaRepository<VideoModerationCheck, Long> {

    List<VideoModerationCheck> findByVideoId(Long videoId);
}

