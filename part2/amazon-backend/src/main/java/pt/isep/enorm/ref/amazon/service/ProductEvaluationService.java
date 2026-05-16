package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.Product;
import pt.isep.enorm.ref.amazon.repository.AmazonUserRepository;
import pt.isep.enorm.ref.amazon.repository.OrderItemRepository;
import pt.isep.enorm.ref.amazon.repository.ProductRepository;
import pt.isep.enorm.ref.amazon.repository.ProductReviewRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedProductEvaluationService;

@Service
public class ProductEvaluationService extends GeneratedProductEvaluationService {

    private final OrderItemRepository orderItemRepository;

    public ProductEvaluationService(
        ProductRepository productRepository,
        AmazonUserRepository amazonUserRepository,
        ProductReviewRepository productReviewRepository,
        OrderItemRepository orderItemRepository
    ) {
        super(productRepository, amazonUserRepository, productReviewRepository);
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    protected boolean isVerifiedBuyerForProduct(AmazonUser user, Product product) {
        return user.isVerifiedBuyer()
            || orderItemRepository.existsByOrderBuyerIdAndProduct_Id(user.getId(), product.getId());
    }
}
