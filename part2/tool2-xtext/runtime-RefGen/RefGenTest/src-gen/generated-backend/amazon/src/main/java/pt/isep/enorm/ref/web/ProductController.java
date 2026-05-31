package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.ProductService;
import pt.isep.enorm.ref.web.generated.GeneratedProductController;

@RestController
@RequestMapping("/api/products")
public class ProductController extends GeneratedProductController {
    public ProductController(ProductService service) {
        super(service);
    }
}
