package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedChannelPermissionPolicy;

@Entity(name = "ChannelPermissionPolicy")
@Table(name = "channel_permission_policies")
public class ChannelPermissionPolicy extends GeneratedChannelPermissionPolicy {
}

