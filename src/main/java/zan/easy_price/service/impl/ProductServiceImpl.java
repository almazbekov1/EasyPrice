package zan.easy_price.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zan.easy_price.domain.dto.ProductView;
import zan.easy_price.domain.dto.UserView;
import zan.easy_price.domain.mapper.ProductViewMapper;
import zan.easy_price.repo.ProductRepo;
import zan.easy_price.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    private final ProductViewMapper productViewMapper;

    public ProductServiceImpl(ProductRepo productRepo, ProductViewMapper productViewMapper) {
        this.productRepo = productRepo;
        this.productViewMapper = productViewMapper;
    }

    @Override
    public ProductView getById(Long id){
       return productViewMapper.viewProduct(productRepo.findById(id).get());
    }

    @Override
    public List<ProductView> getAllProducts() {
        return productViewMapper.viewProducts(productRepo.findAll());
    }


}
