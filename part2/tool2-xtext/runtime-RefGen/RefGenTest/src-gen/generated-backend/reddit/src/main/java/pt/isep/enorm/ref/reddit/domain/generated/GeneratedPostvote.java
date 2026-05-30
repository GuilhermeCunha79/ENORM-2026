package pt.isep.enorm.ref.reddit.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.Post;

@MappedSuperclass
public abstract class GeneratedPostVote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    private RedditUser author;

@ManyToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "subject_id", nullable = false)
private Post subject;

@Column(name = "vote_value", nullable = false)
private int value;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public RedditUser getAuthor() { return author; }
    public void setAuthor(RedditUser author) { this.author = author; }
public Post getSubject() { return subject; }
public void setSubject(Post subject) { this.subject = subject; }
public int getValue() { return value; }
public void setValue(int value) { this.value = value; }
}
