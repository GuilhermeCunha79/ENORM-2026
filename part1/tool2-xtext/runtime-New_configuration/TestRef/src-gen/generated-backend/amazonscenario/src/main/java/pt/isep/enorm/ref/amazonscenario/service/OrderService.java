package pt.isep.enorm.ref.amazonscenario.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazonscenario.repository.OrderRepository;
import pt.isep.enorm.ref.amazonscenario.service.generated.GeneratedOrderService;

@Service
public class OrderService extends GeneratedOrderService {
    public OrderService(OrderRepository repository) {
        super(repository);
    }
}
