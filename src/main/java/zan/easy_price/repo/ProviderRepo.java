package zan.easy_price.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zan.easy_price.domain.dto.UserView;
import zan.easy_price.domain.model.Provider;

@Repository
public interface ProviderRepo extends JpaRepository<Provider,Long> {
}
