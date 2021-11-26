package zan.easy_price.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "providers")
public class Provider {

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
            ,mappedBy = "provider"
            ,fetch = FetchType.LAZY
    )
//    @JoinColumn(name = "product_id")
    private List<Product> products;

    @Transient
    @JsonIgnore
    @OneToOne(mappedBy = "provider",cascade = CascadeType.ALL)
    private User user;

}
