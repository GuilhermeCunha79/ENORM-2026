package pt.isep.enorm.ref.amazon.domain.value;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductPrice {

    @Column(name = "price", nullable = false, precision = 12, scale = 2)
    private BigDecimal value;

    protected ProductPrice() {
    }

    public ProductPrice(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
