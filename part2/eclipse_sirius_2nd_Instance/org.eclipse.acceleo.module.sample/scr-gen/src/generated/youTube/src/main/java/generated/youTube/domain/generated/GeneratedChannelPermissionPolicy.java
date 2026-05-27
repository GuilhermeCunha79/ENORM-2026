package generated.youTube.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public abstract class GeneratedChannelPermissionPolicy {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;
    @Column(name = "action")
    private String action;
    @Column(name = "allowedFor")
    private String allowedFor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    public String getAllowedFor() {
        return allowedFor;
    }

    public void setAllowedFor(String allowedFor) {
        this.allowedFor = allowedFor;
    }
}
