package gift.product.repository;

import gift.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryJpa extends JpaRepository<Product, Long> {
}
