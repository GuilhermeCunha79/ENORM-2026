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
public abstract class GeneratedOrderItem {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;
    @Column(name = "quantity")
    private Double quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
