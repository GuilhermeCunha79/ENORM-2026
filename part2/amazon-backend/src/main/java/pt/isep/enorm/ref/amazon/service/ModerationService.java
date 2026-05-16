package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.amazon.repository.ProductReviewRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedModerationService;

@Service
public class ModerationService extends GeneratedModerationService {

    public ModerationService(ProductReviewRepository productReviewRepository) {
        super(productReviewRepository);
    }
}
