package pt.isep.enorm.ref.amazon.web.generated;

import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class GeneratedOrderController {

    @GetMapping
    public List<Map<String, Object>> list() { return List.of(); }

    @GetMapping("/{orderId}")
    public Map<String, String> get(@PathVariable String orderId) { return Map.of("orderId", orderId); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, Object> create(@RequestBody Map<String, Object> payload) { return payload; }

    @PutMapping("/{orderId}")
    public Map<String, Object> update(@PathVariable String orderId, @RequestBody Map<String, Object> payload) { return payload; }

    @DeleteMapping("/{orderId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String orderId) { }
}
