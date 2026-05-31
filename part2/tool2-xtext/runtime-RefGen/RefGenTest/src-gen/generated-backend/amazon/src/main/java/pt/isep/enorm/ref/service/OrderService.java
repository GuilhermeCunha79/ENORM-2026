package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.OrderRepository;
import pt.isep.enorm.ref.service.generated.GeneratedOrderService;

@Service
public class OrderService extends GeneratedOrderService {
    public OrderService(OrderRepository repository) {
        super(repository);
    }
}
