package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.OrderItemRepository;
import pt.isep.enorm.ref.service.generated.GeneratedOrderItemService;

@Service
public class OrderItemService extends GeneratedOrderItemService {
    public OrderItemService(OrderItemRepository repository) {
        super(repository);
    }
}
