package generated.youTube.repository;

import generated.youTube.domain.ChannelPermissionPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelPermissionPolicyRepository extends JpaRepository<ChannelPermissionPolicy, String> {
}
