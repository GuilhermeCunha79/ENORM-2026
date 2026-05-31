package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.amazon.repository.AmazonUserRepository;
import pt.isep.enorm.ref.amazon.repository.OrderRepository;
import pt.isep.enorm.ref.amazon.repository.ProductRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedOrderService;

@Service
public class OrderService extends GeneratedOrderService {

    public OrderService(
        OrderRepository orderRepository,
        ProductRepository productRepository,
        AmazonUserRepository amazonUserRepository
    ) {
        super(orderRepository, productRepository, amazonUserRepository);
    }
}
