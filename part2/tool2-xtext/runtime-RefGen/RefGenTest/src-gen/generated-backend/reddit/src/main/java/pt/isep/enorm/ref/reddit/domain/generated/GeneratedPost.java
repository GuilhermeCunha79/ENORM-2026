package pt.isep.enorm.ref.reddit.domain.generated;

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

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getPostid() { return postId; }
public void setPostid(String postId) { this.postId = postId; }
public String getTitle() { return title; }
public void setTitle(String title) { this.title = title; }
public String getBody() { return body; }
public void setBody(String body) { this.body = body; }
}
