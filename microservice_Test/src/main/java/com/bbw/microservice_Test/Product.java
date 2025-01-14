package com.bbw.microservice_Test;

<<<<<<< HEAD
import jakarta.persistence.GenerationType;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
=======
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
>>>>>>> ecae20b9642c14e4f5bdd62b96f7a0f9a93e1d1a
import jakarta.persistence.Id;

@Entity
public class Product {
<<<<<<< HEAD

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private double price;

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
=======
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
>>>>>>> ecae20b9642c14e4f5bdd62b96f7a0f9a93e1d1a
        this.id = id;
    }

    public String getName() {
        return name;
    }

<<<<<<< HEAD
    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

=======
>>>>>>> ecae20b9642c14e4f5bdd62b96f7a0f9a93e1d1a
    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public void setDesciption(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
=======
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

>>>>>>> ecae20b9642c14e4f5bdd62b96f7a0f9a93e1d1a
}
