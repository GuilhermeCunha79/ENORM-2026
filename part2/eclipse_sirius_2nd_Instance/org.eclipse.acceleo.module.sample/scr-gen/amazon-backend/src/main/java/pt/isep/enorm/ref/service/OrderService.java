package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.service.generated.GeneratedOrderService;
import pt.isep.enorm.ref.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends GeneratedOrderService {
    public OrderService(OrderRepository repository) {
        super(repository);
    }
}
