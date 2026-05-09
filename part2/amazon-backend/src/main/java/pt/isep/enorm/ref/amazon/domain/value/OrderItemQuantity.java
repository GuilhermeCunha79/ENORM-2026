package pt.isep.enorm.ref.amazon.domain.value;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OrderItemQuantity {

    @Column(name = "quantity", nullable = false)
    private Integer value;

    protected OrderItemQuantity() {
    }

    public OrderItemQuantity(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
