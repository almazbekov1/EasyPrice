package zan.easy_price.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zan.easy_price.domain.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
}
