package com.revature.beesbeignets.repository;

import com.revature.beesbeignets.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query("FROM Product WHERE productName = :name")
    Product findByName(String name);
}
