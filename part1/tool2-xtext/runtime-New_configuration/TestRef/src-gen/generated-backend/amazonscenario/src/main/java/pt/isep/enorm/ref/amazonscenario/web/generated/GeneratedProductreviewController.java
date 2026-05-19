package pt.isep.enorm.ref.amazonscenario.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.amazonscenario.domain.Productreview;
import pt.isep.enorm.ref.amazonscenario.service.ProductreviewService;

public abstract class GeneratedProductreviewController {
    private final ProductreviewService service;

    protected GeneratedProductreviewController(ProductreviewService service) {
        this.service = service;
    }

    @GetMapping
    public List<Productreview> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Productreview> submit(@RequestBody Productreview body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
