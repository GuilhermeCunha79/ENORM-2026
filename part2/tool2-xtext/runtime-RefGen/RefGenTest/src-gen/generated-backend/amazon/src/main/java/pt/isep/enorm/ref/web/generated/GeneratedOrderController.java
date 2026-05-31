package pt.isep.enorm.ref.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import pt.isep.enorm.ref.domain.Order;
import pt.isep.enorm.ref.service.OrderService;

public abstract class GeneratedOrderController {
    private final OrderService service;

    protected GeneratedOrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<Order> list(
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false, defaultValue = "ASC") String direction) {
        return service.findAll(sortBy, direction);
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
