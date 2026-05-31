package pt.isep.enorm.ref.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public abstract class GeneratedPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@NotNull
@Column(nullable = false, length = 2000)
private String postId;

@NotNull
@Column(nullable = false, length = 2000)
private String title;

@NotNull
@Column(nullable = false, length = 2000)
private String body;

@jakarta.persistence.OneToMany()
@jakarta.persistence.JoinColumn(name = "post_id")
private java.util.List<pt.isep.enorm.ref.domain.Comment> comments = new java.util.ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getPostId() { return postId; }
public void setPostId(String postId) { this.postId = postId; }
public String getTitle() { return title; }
public void setTitle(String title) { this.title = title; }
public String getBody() { return body; }
public void setBody(String body) { this.body = body; }
public java.util.List<pt.isep.enorm.ref.domain.Comment> getComments() { return comments; }
public void setComments(java.util.List<pt.isep.enorm.ref.domain.Comment> comments) { this.comments = comments; }
}
