package zan.easy_price.domain.mapper;

import org.springframework.stereotype.Component;
import zan.easy_price.domain.dto.ProductView;
import zan.easy_price.domain.dto.UserView;
import zan.easy_price.domain.model.Product;
import zan.easy_price.domain.model.User;
import zan.easy_price.domain.object.ProviderObject;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductViewMapper {

    public ProductView viewProduct(Product product){
        if (product == null) {
            return null;
        }
        ProductView productView = new ProductView();

        if (product.getId() != null) {
            productView.setId(String.valueOf(product.getId()));
        }

        productView.setExpirationDate(product.getExpirationDate());
        productView.setName(product.getName());
        productView.setFactoryPackaging(product.getFactoryPackaging());
        productView.setPrice(product.getPrice());
        productView.setManufacturing(product.getManufacturing());
        productView.setUnit(product.getUnit());

        ProviderObject providerObject = new ProviderObject();

        providerObject.setAddress(product.getProvider().getAddress());
        providerObject.setEmail(product.getProvider().getEmail());
        providerObject.setName(product.getProvider().getName());
        providerObject.setCity(product.getProvider().getCity());
        providerObject.setPhoneNumber(product.getProvider().getPhoneNumber());
        productView.setProvider(providerObject);




        return productView;
    }

    public List<ProductView> viewProducts(List<Product> products) {
        List<ProductView> productViews= new ArrayList<>();
        for (Product product:products) {
            productViews.add(viewProduct(product));
        }
        return productViews;
    }
}
