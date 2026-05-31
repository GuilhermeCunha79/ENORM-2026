package pt.isep.enorm.ref.amazon.domain.value;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductName {

    @Column(name = "name", nullable = false, length = 120)
    private String value;

    protected ProductName() {
    }

    public ProductName(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
