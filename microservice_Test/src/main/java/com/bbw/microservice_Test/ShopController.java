package com.bbw.microservice_Test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ShopController {
    @Autowired 
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.listAll();
    }
}
