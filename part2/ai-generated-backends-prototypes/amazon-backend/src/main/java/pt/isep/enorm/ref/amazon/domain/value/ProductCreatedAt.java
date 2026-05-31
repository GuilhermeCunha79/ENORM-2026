package pt.isep.enorm.ref.amazon.domain.value;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductCreatedAt {

    @Column(name = "created_at")
    private LocalDate value;

    protected ProductCreatedAt() {
    }

    public ProductCreatedAt(LocalDate value) {
        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }

    public void setValue(LocalDate value) {
        this.value = value;
    }
}
