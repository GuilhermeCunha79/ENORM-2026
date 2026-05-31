package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.youtube.domain.Video;

@NoRepositoryBean
public interface GeneratedVideoRepository extends JpaRepository<Video, Long> {

    List<Video> findByChannelIdOrderByUploadDateDesc(Long channelId);
}

