package zan.easy_price.domain.dto;

import lombok.Data;
import zan.easy_price.domain.model.Provider;

import javax.persistence.Column;
import java.util.List;

@Data
public class ProductView {

    private String id;
    private String name;
    private String unit;
    private Double price;
    private String manufacturing;
    private String expirationDate;
    private String factoryPackaging;
    private Provider provider;

}
