package pt.isep.enorm.ref.amazon.domain.generated;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.Order;
import pt.isep.enorm.ref.amazon.domain.OrderItem;
import pt.isep.enorm.ref.amazon.domain.value.OrderCode;
import pt.isep.enorm.ref.amazon.domain.value.OrderDate;

@MappedSuperclass
public abstract class GeneratedOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private OrderCode orderCode;

    @Embedded
    private OrderDate orderDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "buyer_id", nullable = false)
    private AmazonUser buyer;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode == null ? null : orderCode.getValue();
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : new OrderCode(orderCode);
    }

    public LocalDate getOrderDate() {
        return orderDate == null ? null : orderDate.getValue();
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate == null ? null : new OrderDate(orderDate);
    }

    public AmazonUser getBuyer() {
        return buyer;
    }

    public void setBuyer(AmazonUser buyer) {
        this.buyer = buyer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem orderItem) {
        orderItem.setOrder((Order) this);
        items.add(orderItem);
    }
}
