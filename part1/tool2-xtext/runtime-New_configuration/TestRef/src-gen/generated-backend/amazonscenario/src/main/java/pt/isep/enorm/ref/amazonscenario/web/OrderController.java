package pt.isep.enorm.ref.amazonscenario.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.amazonscenario.service.OrderService;
import pt.isep.enorm.ref.amazonscenario.web.generated.GeneratedOrderController;

@RestController
@RequestMapping("/api/orders")
public class OrderController extends GeneratedOrderController {
    public OrderController(OrderService service) {
        super(service);
    }
}
