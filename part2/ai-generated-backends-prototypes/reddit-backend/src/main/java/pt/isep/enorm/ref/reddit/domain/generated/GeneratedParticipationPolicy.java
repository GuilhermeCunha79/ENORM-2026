package pt.isep.enorm.ref.reddit.domain.generated;

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
import pt.isep.enorm.ref.reddit.domain.Subreddit;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.PermissionAction;
import pt.isep.enorm.ref.reddit.domain.enums.PermissionAudience;

@MappedSuperclass
public abstract class GeneratedParticipationPolicy {

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
    @JoinColumn(name = "subreddit_id", nullable = false)
    private Subreddit subreddit;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "configured_by_id", nullable = false)
    private RedditUser configuredBy;

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

    public Subreddit getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(Subreddit subreddit) {
        this.subreddit = subreddit;
    }

    public RedditUser getConfiguredBy() {
        return configuredBy;
    }

    public void setConfiguredBy(RedditUser configuredBy) {
        this.configuredBy = configuredBy;
    }
}




