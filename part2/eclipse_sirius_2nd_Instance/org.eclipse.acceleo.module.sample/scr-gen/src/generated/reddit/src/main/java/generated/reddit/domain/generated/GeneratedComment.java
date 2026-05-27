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
public abstract class GeneratedComment extends GeneratedContent {
    @Column(name = "body")
    private String body;
    @Column(name = "supportsVote")
    private Boolean supportsVote;
    @Column(name = "supportsReport")
    private Boolean supportsReport;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public Boolean getSupportsVote() {
        return supportsVote;
    }

    public void setSupportsVote(Boolean supportsVote) {
        this.supportsVote = supportsVote;
    }
    public Boolean getSupportsReport() {
        return supportsReport;
    }

    public void setSupportsReport(Boolean supportsReport) {
        this.supportsReport = supportsReport;
    }
}
