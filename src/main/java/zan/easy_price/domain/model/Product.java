package zan.easy_price.domain.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String unit;

    private Double price;

    private String manufacturing;

    @Column(name = "expiration_date")
    private String expirationDate;

    @Column(name = "factory_packaging")
    private String factoryPackaging;

    private Boolean enabled = true;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "provider_id")
    private Provider provider;


}
