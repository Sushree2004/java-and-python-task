package com.example.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="Restaurant")
@Entity 

public class Restaurant_Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private float price;

    @Column(name = "cuisine")
    private String cuisine;

// Empty Constructor
    public Restaurant_Model() {

    }

    public Restaurant_Model(String name, String cuisine, float price) {
    this.name = name;
    this.cuisine = cuisine;
    this.price = price;
    }

    public long getId() {
    return id;
    }

    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public String getCuisine() {
    return cuisine;
    }

    public void setDescription(String cuisine) {
    this.cuisine = cuisine;
    }

    public float getPrice() {
    return price;
    }

    public void setPrice(float price) {
    this.price = price;
    }

    @Override
    public String toString() {
        return "Restaurant_Model [id=" + id + ", name=" + name + ", cuisine=" + cuisine + ", price=" + price + "]";
    }

}
    

