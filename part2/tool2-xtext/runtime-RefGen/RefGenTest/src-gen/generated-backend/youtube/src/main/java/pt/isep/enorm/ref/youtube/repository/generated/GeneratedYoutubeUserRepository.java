package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;

public interface GeneratedYoutubeUserRepository extends JpaRepository<YoutubeUser, Long> {
    Optional<YoutubeUser> findByUsername(String username);
}
