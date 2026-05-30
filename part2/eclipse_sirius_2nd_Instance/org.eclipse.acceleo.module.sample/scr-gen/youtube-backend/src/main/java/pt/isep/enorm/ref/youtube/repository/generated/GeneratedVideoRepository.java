package pt.isep.enorm.ref.youtube.repository.generated;

import pt.isep.enorm.ref.youtube.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedVideoRepository extends JpaRepository<Video, Long> {
}
