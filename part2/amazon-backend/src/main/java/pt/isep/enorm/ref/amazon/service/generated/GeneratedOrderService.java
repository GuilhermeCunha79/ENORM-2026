package pt.isep.enorm.ref.amazon.service.generated;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.Order;
import pt.isep.enorm.ref.amazon.domain.OrderItem;
import pt.isep.enorm.ref.amazon.domain.Product;
import pt.isep.enorm.ref.amazon.repository.AmazonUserRepository;
import pt.isep.enorm.ref.amazon.repository.OrderRepository;
import pt.isep.enorm.ref.amazon.repository.ProductRepository;
import pt.isep.enorm.ref.amazon.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedOrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final AmazonUserRepository amazonUserRepository;

    protected GeneratedOrderService(
        OrderRepository orderRepository,
        ProductRepository productRepository,
        AmazonUserRepository amazonUserRepository
    ) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.amazonUserRepository = amazonUserRepository;
    }

    public List<Order> listOrders(String username) {
        AmazonUser buyer = loadUserByUsername(username);
        return orderRepository.findByBuyerId(buyer.getId());
    }

    public Order getOrder(Long orderId, String username) {
        Order order = loadOrder(orderId);
        ensureOwner(order, username);
        return order;
    }

    @Transactional
    public Order createOrder(String username, Order request) {
        AmazonUser buyer = loadUserByUsername(username);

        Order order = new Order();
        order.setBuyer(buyer);
        order.setOrderCode(resolveOrderCode(request.getOrderCode()));
        order.setOrderDate(resolveOrderDate(request.getOrderDate()));

        if (request.getItems() == null || request.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order items are required.");
        }

        for (OrderItem itemRequest : request.getItems()) {
            order.addItem(toOrderItem(itemRequest));
        }

        return orderRepository.save(order);
    }

    @Transactional
    public Order updateOrder(Long orderId, String username, Order request) {
        Order order = loadOrder(orderId);
        ensureOwner(order, username);

        if (request.getOrderCode() != null && !request.getOrderCode().isBlank()) {
            order.setOrderCode(request.getOrderCode().trim());
        }

        if (request.getOrderDate() != null) {
            order.setOrderDate(request.getOrderDate());
        }

        if (request.getItems() != null && !request.getItems().isEmpty()) {
            order.getItems().clear();
            for (OrderItem itemRequest : request.getItems()) {
                order.addItem(toOrderItem(itemRequest));
            }
        }

        return orderRepository.save(order);
    }

    @Transactional
    public void deleteOrder(Long orderId, String username) {
        Order order = loadOrder(orderId);
        ensureOwner(order, username);
        orderRepository.delete(order);
    }

    private OrderItem toOrderItem(OrderItem itemRequest) {
        if (itemRequest.getProduct() == null || itemRequest.getProduct().getId() == null) {
            throw new IllegalArgumentException("Order item product is required.");
        }

        Product product = loadProduct(itemRequest.getProduct().getId());
        if (itemRequest.getQuantity() == null || itemRequest.getQuantity() <= 0) {
            throw new IllegalArgumentException("Order item quantity must be positive.");
        }

        OrderItem item = new OrderItem();
        item.setProduct(product);
        item.setQuantity(itemRequest.getQuantity());
        return item;
    }

    private String resolveOrderCode(String orderCode) {
        if (orderCode == null || orderCode.isBlank()) {
            return "ORD-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        }
        return orderCode.trim();
    }

    private LocalDate resolveOrderDate(LocalDate orderDate) {
        return orderDate == null ? LocalDate.now() : orderDate;
    }

    private Order loadOrder(Long orderId) {
        return orderRepository.findById(orderId)
            .orElseThrow(() -> new ResourceNotFoundException("Order '%s' was not found.".formatted(orderId)));
    }

    private Product loadProduct(Long productId) {
        return productRepository.findById(productId)
            .orElseThrow(() -> new ResourceNotFoundException("Product '%s' was not found.".formatted(productId)));
    }

    private AmazonUser loadUserByUsername(String username) {
        return amazonUserRepository.findByUsername(username)
            .orElseThrow(() -> new ResourceNotFoundException("User '%s' was not found.".formatted(username)));
    }

    private void ensureOwner(Order order, String username) {
        if (!order.getBuyer().getUsername().equals(username)) {
            throw new IllegalStateException("Order access denied for user '%s'.".formatted(username));
        }
    }
}
