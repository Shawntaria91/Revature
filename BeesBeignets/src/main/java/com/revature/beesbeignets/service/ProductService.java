package com.revature.beesbeignets.service;

import com.revature.beesbeignets.entity.Product;
import com.revature.beesbeignets.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {

        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {

        return repository.saveAll(products);
    }

    public List<Product> getProducts() {

        return repository.findAll();
    }

    public Product getProductById(int pid) {

        return repository.findById(pid).orElse(null);
    }

    public Product getProductByName(String productName) {

        return repository.findByName(productName);
    }

    public String deleteProduct(int pid) {
        repository.deleteById(pid);
        return "Product with ID: " + pid + " removed!";
    }

    public Product updateProduct(Product product) {

        Product existingProd=repository.findById(product.getPid()).orElse(null);
        existingProd.setProductName(product.getProductName());
        existingProd.setQuantity(product.getQuantity());
        existingProd.setPrice(product.getPrice());
        return repository.save(existingProd);
    }
}
