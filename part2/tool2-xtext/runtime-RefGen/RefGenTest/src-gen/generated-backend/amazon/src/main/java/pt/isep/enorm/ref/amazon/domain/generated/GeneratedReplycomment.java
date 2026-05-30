package pt.isep.enorm.ref.amazon.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.TopThreadComment;

@MappedSuperclass
public abstract class GeneratedReplyComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    private AmazonUser author;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "parent_feedback_id")
private TopThreadComment parentFeedback;

@Column(nullable = false, length = 2000)
private String comment;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public AmazonUser getAuthor() { return author; }
    public void setAuthor(AmazonUser author) { this.author = author; }
public TopThreadComment getParentFeedback() { return parentFeedback; }
public void setParentFeedback(TopThreadComment parentFeedback) { this.parentFeedback = parentFeedback; }
public String getComment() { return comment; }
public void setComment(String comment) { this.comment = comment; }
}
