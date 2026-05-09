package pt.isep.enorm.ref.amazon.domain.generated;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import pt.isep.enorm.ref.amazon.domain.value.ProductCreatedAt;
import pt.isep.enorm.ref.amazon.domain.value.ProductDescription;
import pt.isep.enorm.ref.amazon.domain.value.ProductName;
import pt.isep.enorm.ref.amazon.domain.value.ProductPrice;

@MappedSuperclass
public abstract class GeneratedProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private ProductName name;

    @Embedded
    private ProductDescription description;

    @Embedded
    private ProductPrice price;

    @Embedded
    private ProductCreatedAt createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name == null ? null : name.getValue();
    }

    public void setName(String name) {
        this.name = name == null ? null : new ProductName(name);
    }

    public String getDescription() {
        return description == null ? null : description.getValue();
    }

    public void setDescription(String description) {
        this.description = description == null ? null : new ProductDescription(description);
    }

    public BigDecimal getPrice() {
        return price == null ? null : price.getValue();
    }

    public void setPrice(BigDecimal price) {
        this.price = price == null ? null : new ProductPrice(price);
    }

    public LocalDate getCreatedAt() {
        return createdAt == null ? null : createdAt.getValue();
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt == null ? null : new ProductCreatedAt(createdAt);
    }
}