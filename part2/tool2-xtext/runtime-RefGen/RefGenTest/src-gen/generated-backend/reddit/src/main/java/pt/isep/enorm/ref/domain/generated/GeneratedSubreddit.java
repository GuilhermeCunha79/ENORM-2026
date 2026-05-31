package pt.isep.enorm.ref.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public abstract class GeneratedSubreddit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@NotNull
@Column(nullable = false, length = 2000)
private String subredditName;

@Column(nullable = true, length = 2000)
private String description;

@jakarta.persistence.OneToMany()
@jakarta.persistence.JoinColumn(name = "subreddit_id")
private java.util.List<pt.isep.enorm.ref.domain.Post> posts = new java.util.ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getSubredditName() { return subredditName; }
public void setSubredditName(String subredditName) { this.subredditName = subredditName; }
public String getDescription() { return description; }
public void setDescription(String description) { this.description = description; }
public java.util.List<pt.isep.enorm.ref.domain.Post> getPosts() { return posts; }
public void setPosts(java.util.List<pt.isep.enorm.ref.domain.Post> posts) { this.posts = posts; }
}
