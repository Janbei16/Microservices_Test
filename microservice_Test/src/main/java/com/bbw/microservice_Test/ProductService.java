package com.bbw.microservice_Test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

interface ProductRepository {
    List<Product> findAll();
}

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        // save product to database
    }

    
}
