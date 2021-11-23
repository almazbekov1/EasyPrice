package zan.easy_price.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String login;

    private String password;

    private String phoneNumber;

    private Boolean enabled = true;

    private LocalDate registerDate;

    private String email;

    private String company;

    @ManyToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.REFRESH)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @OneToMany(cascade = CascadeType.ALL
            ,mappedBy = "user"
            ,fetch = FetchType.LAZY
    )
//    @JoinColumn(name = "department_id")
    private List<Product> products;



}
