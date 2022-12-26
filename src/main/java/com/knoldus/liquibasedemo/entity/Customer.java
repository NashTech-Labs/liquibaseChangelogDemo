package com.knoldus.liquibasedemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    private int id;
    @Column
    private String name;

    @Column
    private String state;

    @Column
    private String productBought;

    public Customer() {

    }

    public Customer(int id, String name, String state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return name;
    }

    public void setCustomerName(String name) {
        this.name = name;
    }

    public String getCustomerAddress() {
        return state;
    }

    public void setCustomerAddress(String state) {
        this.state = state;
    }

    public String getProductBought() {
        return productBought;
    }

    public void setProductBought(String productBought) {
        this.productBought = productBought;
    }
}
