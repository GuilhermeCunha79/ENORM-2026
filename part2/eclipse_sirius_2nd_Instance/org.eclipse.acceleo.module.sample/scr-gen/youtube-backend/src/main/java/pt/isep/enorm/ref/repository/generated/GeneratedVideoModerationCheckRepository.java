package pt.isep.enorm.ref.repository.generated;

import pt.isep.enorm.ref.domain.VideoModerationCheck;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedVideoModerationCheckRepository extends JpaRepository<VideoModerationCheck, Long> {
    List<VideoModerationCheck> findByVideoId(Long videoId);
}
