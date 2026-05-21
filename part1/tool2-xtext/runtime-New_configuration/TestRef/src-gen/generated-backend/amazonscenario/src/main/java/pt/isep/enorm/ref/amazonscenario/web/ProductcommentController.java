package pt.isep.enorm.ref.amazonscenario.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.amazonscenario.service.ProductcommentService;
import pt.isep.enorm.ref.amazonscenario.web.generated.GeneratedProductcommentController;

@RestController
@RequestMapping("/api/productcomments")
public class ProductcommentController extends GeneratedProductcommentController {
    public ProductcommentController(ProductcommentService service) {
        super(service);
    }
}
