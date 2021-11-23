package zan.easy_price.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
}
