package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedOrderItem;

@Entity(name = "OrderItem")
@Table(name = "order_items")
public class OrderItem extends GeneratedOrderItem {

    @Transient
    public Long getProductId() {
        return getProduct() == null ? null : getProduct().getId();
    }

    public void setProductId(Long productId) {
        if (productId == null) {
            setProduct(null);
            return;
        }

        Product product = new Product();
        product.setId(productId);
        setProduct(product);
    }
}
