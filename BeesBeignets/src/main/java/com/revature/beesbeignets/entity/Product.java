package com.revature.beesbeignets.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "PRODUCT_TABLE")
public class Product {

    @Id
    private int pid;
    //@Column(unique = true)
    private String productName;
    private int quantity;
    private double price;
}
