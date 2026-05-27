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
public abstract class GeneratedLike {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;
    @Column(name = "value_col")
    private String value;
    @Column(name = "timestamp_col")
    private LocalDate timestamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }
}
