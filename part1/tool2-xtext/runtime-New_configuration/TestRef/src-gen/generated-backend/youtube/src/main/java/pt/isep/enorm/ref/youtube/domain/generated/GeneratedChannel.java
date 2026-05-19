package pt.isep.enorm.ref.youtube.domain.generated;

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

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getHandle() { return handle; }
public void setHandle(String handle) { this.handle = handle; }
public String getDisplayname() { return displayName; }
public void setDisplayname(String displayName) { this.displayName = displayName; }
}
