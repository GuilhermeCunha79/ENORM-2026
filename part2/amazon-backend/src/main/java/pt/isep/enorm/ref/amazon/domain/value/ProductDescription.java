package pt.isep.enorm.ref.amazon.domain.value;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductDescription {

    @Column(name = "description", nullable = false, length = 2000)
    private String value;

    protected ProductDescription() {
    }

    public ProductDescription(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
