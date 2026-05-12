package pt.isep.enorm.ref.youtube.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import pt.isep.enorm.ref.youtube.domain.Channel;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.PermissionAction;
import pt.isep.enorm.ref.youtube.domain.enums.PermissionAudience;

@MappedSuperclass
public abstract class GeneratedChannelPermissionPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private PermissionAction action;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private PermissionAudience allowedFor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "channel_id", nullable = false)
    private Channel channel;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "configured_by_id", nullable = false)
    private YoutubeUser configuredBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PermissionAction getAction() {
        return action;
    }

    public void setAction(PermissionAction action) {
        this.action = action;
    }

    public PermissionAudience getAllowedFor() {
        return allowedFor;
    }

    public void setAllowedFor(PermissionAudience allowedFor) {
        this.allowedFor = allowedFor;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public YoutubeUser getConfiguredBy() {
        return configuredBy;
    }

    public void setConfiguredBy(YoutubeUser configuredBy) {
        this.configuredBy = configuredBy;
    }
}

