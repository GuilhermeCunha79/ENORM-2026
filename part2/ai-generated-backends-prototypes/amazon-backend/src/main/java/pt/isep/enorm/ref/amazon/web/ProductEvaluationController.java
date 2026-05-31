package pt.isep.enorm.ref.amazon.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.amazon.service.ProductEvaluationService;
import pt.isep.enorm.ref.amazon.web.generated.GeneratedProductEvaluationController;

@RestController
@RequestMapping("/api/products")
public class ProductEvaluationController extends GeneratedProductEvaluationController {

    public ProductEvaluationController(ProductEvaluationService productEvaluationService) {
        super(productEvaluationService);
    }
}