package pt.isep.enorm.ref.amazon.repository;

import org.springframework.stereotype.Repository;

import pt.isep.enorm.ref.amazon.repository.generated.GeneratedOrderItemRepository;

@Repository
public interface OrderItemRepository extends GeneratedOrderItemRepository {

    boolean existsByOrderBuyerIdAndProductId(Long buyerId, Long productId);
}
