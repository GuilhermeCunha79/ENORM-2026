package pt.isep.enorm.ref.amazonscenario.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.amazonscenario.domain.Productcomment;
import pt.isep.enorm.ref.amazonscenario.service.ProductcommentService;

public abstract class GeneratedProductcommentController {
    private final ProductcommentService service;

    protected GeneratedProductcommentController(ProductcommentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Productcomment> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Productcomment> submit(@RequestBody Productcomment body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
