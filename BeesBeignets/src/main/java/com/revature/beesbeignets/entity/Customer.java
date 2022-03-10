package com.revature.beesbeignets.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name= "CUSTOMER_TABLE")
public class Customer {
    @Id
    @GeneratedValue
    private int cid;
    private String customerName;
    private String email;
    private String address;
    @GeneratedValue
    private Long orderNumber;
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cusProd_fk",referencedColumnName = "cid")
    private List<Product> products;
}
