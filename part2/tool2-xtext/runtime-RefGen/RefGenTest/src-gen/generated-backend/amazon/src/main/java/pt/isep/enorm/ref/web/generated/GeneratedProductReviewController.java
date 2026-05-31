package pt.isep.enorm.ref.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.domain.ProductReview;
import pt.isep.enorm.ref.service.ProductReviewService;

public abstract class GeneratedProductReviewController {
    private final ProductReviewService service;

    protected GeneratedProductReviewController(ProductReviewService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductReview> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<ProductReview> submit(@RequestBody ProductReview body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
