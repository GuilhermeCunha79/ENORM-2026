package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.repository.OrderRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedOrderService;

@Service
public class OrderService extends GeneratedOrderService {
    public OrderService(OrderRepository repository) {
        super(repository);
    }
}
