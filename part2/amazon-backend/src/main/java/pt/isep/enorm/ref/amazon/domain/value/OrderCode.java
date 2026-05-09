package pt.isep.enorm.ref.amazon.domain.value;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OrderCode {

    @Column(name = "order_code", nullable = false, length = 80)
    private String value;

    protected OrderCode() {
    }

    public OrderCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
