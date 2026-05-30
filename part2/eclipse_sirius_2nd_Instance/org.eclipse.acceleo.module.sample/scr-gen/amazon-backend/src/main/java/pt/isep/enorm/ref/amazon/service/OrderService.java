package pt.isep.enorm.ref.amazon.service;

import pt.isep.enorm.ref.amazon.service.generated.GeneratedOrderService;
import pt.isep.enorm.ref.amazon.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends GeneratedOrderService {
    public OrderService(OrderRepository repository) {
        super(repository);
    }
}
