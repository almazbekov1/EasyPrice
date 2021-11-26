package zan.easy_price.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProviderView {

    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private List<ProductView> products;
}
