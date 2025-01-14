package com.bbw.microservice_Test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private int stock;

    // Getter Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription(String description){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public double getPrice(double price){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getStock(int stock){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    // Constructor
    public Product() {
    }

    public Product(String name, String description, double price, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

}
