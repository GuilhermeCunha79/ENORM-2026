package pt.isep.enorm.ref.amazon.domain.value;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OrderDate {

    @Column(name = "order_date", nullable = false)
    private LocalDate value;

    protected OrderDate() {
    }

    public OrderDate(LocalDate value) {
        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }

    public void setValue(LocalDate value) {
        this.value = value;
    }
}
