package pt.isep.enorm.ref.reddit.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public abstract class GeneratedComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@NotNull
@Column(nullable = false, length = 2000)
private String commentId;

@NotNull
@Column(nullable = false, length = 2000)
private String text;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getCommentid() { return commentId; }
public void setCommentid(String commentId) { this.commentId = commentId; }
public String getText() { return text; }
public void setText(String text) { this.text = text; }
}
