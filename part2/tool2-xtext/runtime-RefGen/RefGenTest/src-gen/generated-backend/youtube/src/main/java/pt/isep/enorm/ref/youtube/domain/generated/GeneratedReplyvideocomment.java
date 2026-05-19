package pt.isep.enorm.ref.youtube.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;

@MappedSuperclass
public abstract class GeneratedReplyvideocomment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    private YoutubeUser author;

    @Column(nullable = false, length = 2000)
    private String comment;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public YoutubeUser getAuthor() { return author; }
    public void setAuthor(YoutubeUser author) { this.author = author; }
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
}
