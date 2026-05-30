package pt.isep.enorm.ref.youtube.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.Video;

@MappedSuperclass
public abstract class GeneratedVideoLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    private YoutubeUser author;

@ManyToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "subject_id", nullable = false)
private Video subject;

@Column(name = "vote_value", nullable = false)
private int value;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public YoutubeUser getAuthor() { return author; }
    public void setAuthor(YoutubeUser author) { this.author = author; }
public Video getSubject() { return subject; }
public void setSubject(Video subject) { this.subject = subject; }
public int getValue() { return value; }
public void setValue(int value) { this.value = value; }
}
