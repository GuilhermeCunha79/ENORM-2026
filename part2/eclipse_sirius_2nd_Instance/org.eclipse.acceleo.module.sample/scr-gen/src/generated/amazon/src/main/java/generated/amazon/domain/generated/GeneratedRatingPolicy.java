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
public abstract class GeneratedRatingPolicy {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;
    @Column(name = "minValue")
    private Double minValue;
    @Column(name = "maxValue")
    private Double maxValue;
    @Column(name = "step")
    private Double step;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }
    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }
    public Double getStep() {
        return step;
    }

    public void setStep(Double step) {
        this.step = step;
    }
}
