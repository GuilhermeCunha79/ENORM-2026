package generated.amazon.repository.generated;

import generated.amazon.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedProductRepository extends JpaRepository<Product, String> {
}
