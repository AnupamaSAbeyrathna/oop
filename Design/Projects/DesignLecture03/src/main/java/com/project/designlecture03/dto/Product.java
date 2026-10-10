package com.project.designlecture03.dto;

public class Product {
    private long id;
    private String name;
    private double price;

    public Long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
