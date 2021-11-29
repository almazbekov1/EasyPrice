package zan.easy_price.service;

import zan.easy_price.domain.dto.ProductView;
import zan.easy_price.domain.dto.UserView;

import java.util.List;

public interface ProductService {
    ProductView getById(Long id);
    List<ProductView> getAllProducts();
}
