package pt.isep.enorm.ref.youtube.repository.generated;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.youtube.domain.ChannelPermissionPolicy;

@NoRepositoryBean
public interface GeneratedChannelPermissionPolicyRepository extends JpaRepository<ChannelPermissionPolicy, Long> {

    List<ChannelPermissionPolicy> findByChannelId(Long channelId);
}

