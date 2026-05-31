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
import pt.isep.enorm.ref.reddit.domain.Comment;
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.VoteValue;

@MappedSuperclass
public abstract class GeneratedVote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "vote_value", nullable = false, length = 16)
    private VoteValue value;

    @Column(nullable = false)
    private Instant timestamp;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private RedditUser user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
    private Comment comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VoteValue getValue() {
        return value;
    }

    public void setValue(VoteValue value) {
        this.value = value;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public RedditUser getUser() {
        return user;
    }

    public void setUser(RedditUser user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}




