package pt.isep.enorm.ref.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public abstract class GeneratedChannel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@NotNull
@Column(nullable = false, length = 2000)
private String handle;

@NotNull
@Column(nullable = false, length = 2000)
private String displayName;

@jakarta.persistence.OneToMany()
@jakarta.persistence.JoinColumn(name = "channel_id")
private java.util.List<pt.isep.enorm.ref.domain.Video> videos = new java.util.ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getHandle() { return handle; }
public void setHandle(String handle) { this.handle = handle; }
public String getDisplayName() { return displayName; }
public void setDisplayName(String displayName) { this.displayName = displayName; }
public java.util.List<pt.isep.enorm.ref.domain.Video> getVideos() { return videos; }
public void setVideos(java.util.List<pt.isep.enorm.ref.domain.Video> videos) { this.videos = videos; }
}
