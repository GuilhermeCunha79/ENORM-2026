package generated.amazon.domain.generated;

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
public abstract class GeneratedProductReview {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;
    @Column(name = "rating")
    private Double rating;
    @Column(name = "text")
    private String text;
    @Column(name = "creationDate")
    private LocalDate creationDate;
    @Column(name = "verifiedPurchase")
    private Boolean verifiedPurchase;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
    public Boolean getVerifiedPurchase() {
        return verifiedPurchase;
    }

    public void setVerifiedPurchase(Boolean verifiedPurchase) {
        this.verifiedPurchase = verifiedPurchase;
    }
}
