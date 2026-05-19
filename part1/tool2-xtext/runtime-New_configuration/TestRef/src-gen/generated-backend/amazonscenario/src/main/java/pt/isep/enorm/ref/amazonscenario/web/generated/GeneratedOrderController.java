package pt.isep.enorm.ref.amazonscenario.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.amazonscenario.domain.Order;
import pt.isep.enorm.ref.amazonscenario.service.OrderService;

public abstract class GeneratedOrderController {
    private final OrderService service;

    protected GeneratedOrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<Order> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Order get(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public ResponseEntity<Order> create(@RequestBody Order body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(body));
    }
}
