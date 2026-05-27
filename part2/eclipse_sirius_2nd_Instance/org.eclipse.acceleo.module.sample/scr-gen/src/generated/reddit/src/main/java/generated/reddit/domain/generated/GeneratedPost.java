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
public abstract class GeneratedPost extends GeneratedContent {
    @Column(name = "title")
    private String title;
    @Column(name = "body")
    private String body;
    @Column(name = "type")
    private String type;
    @Column(name = "supportsVote")
    private Boolean supportsVote;
    @Column(name = "supportsReport")
    private Boolean supportsReport;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
