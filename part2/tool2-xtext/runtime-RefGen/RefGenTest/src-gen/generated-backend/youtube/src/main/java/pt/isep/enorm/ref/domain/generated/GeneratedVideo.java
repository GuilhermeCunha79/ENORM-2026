package pt.isep.enorm.ref.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public abstract class GeneratedVideo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@NotNull
@Column(nullable = false, length = 2000)
private String videoId;

@NotNull
@Column(nullable = false, length = 2000)
private String title;

@Column(nullable = true, length = 2000)
private String description;

@NotNull
@Column(nullable = false)
private java.math.BigDecimal durationSeconds;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getVideoId() { return videoId; }
public void setVideoId(String videoId) { this.videoId = videoId; }
public String getTitle() { return title; }
public void setTitle(String title) { this.title = title; }
public String getDescription() { return description; }
public void setDescription(String description) { this.description = description; }
public java.math.BigDecimal getDurationSeconds() { return durationSeconds; }
public void setDurationSeconds(java.math.BigDecimal durationSeconds) { this.durationSeconds = durationSeconds; }
}
