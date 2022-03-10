package com.revature.beesbeignets.repository;

import com.revature.beesbeignets.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
