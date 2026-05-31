package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.youtube.domain.Channel;

@NoRepositoryBean
public interface GeneratedChannelRepository extends JpaRepository<Channel, Long> {

    List<Channel> findAllByOrderByNameAsc();

    List<Channel> findByOwnerId(Long ownerId);
}

