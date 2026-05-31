package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.youtube.domain.YoutubeUser;

@NoRepositoryBean
public interface GeneratedYoutubeUserRepository extends JpaRepository<YoutubeUser, Long> {

    Optional<YoutubeUser> findByUsername(String username);

    boolean existsByUsername(String username);
}

