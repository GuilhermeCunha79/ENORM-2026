package pt.isep.enorm.ref.reddit.domain.generated;

import java.time.Instant;

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
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.CommentStatus;

@MappedSuperclass
public abstract class GeneratedCommunityRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private CommentStatus newStatus;

    @Column(nullable = false)
    private Instant timestamp;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "moderator_id", nullable = false)
    private RedditUser moderator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CommentStatus getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(CommentStatus newStatus) {
        this.newStatus = newStatus;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public RedditUser getModerator() {
        return moderator;
    }

    public void setModerator(RedditUser moderator) {
        this.moderator = moderator;
    }
}




