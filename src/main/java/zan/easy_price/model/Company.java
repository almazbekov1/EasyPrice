package zan.easy_price.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private boolean enabled = true;

    private String city;

    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String email;

    @OneToMany(cascade = CascadeType.ALL
            ,mappedBy = "company"
            ,fetch = FetchType.LAZY
    )
//    @JoinColumn(name = "product_id")
    private List<Product> products;

    @Transient
    @JsonIgnore
    @OneToOne(mappedBy = "company",cascade = CascadeType.ALL)
    private User user;

}
