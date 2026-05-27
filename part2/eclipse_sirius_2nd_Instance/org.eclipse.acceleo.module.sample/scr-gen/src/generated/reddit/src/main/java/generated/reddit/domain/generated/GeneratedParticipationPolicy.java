package generated.reddit.domain.generated;

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
public abstract class GeneratedParticipationPolicy {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;
    @Column(name = "action")
    private String action;
    @Column(name = "allowedWhen")
    private String allowedWhen;

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
    public String getAllowedWhen() {
        return allowedWhen;
    }

    public void setAllowedWhen(String allowedWhen) {
        this.allowedWhen = allowedWhen;
    }
}
