package pt.isep.enorm.ref.reddit.domain.generated;

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

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getSubredditname() { return subredditName; }
public void setSubredditname(String subredditName) { this.subredditName = subredditName; }
public String getDescription() { return description; }
public void setDescription(String description) { this.description = description; }
}
