package com.softwareguild.mvc.model;

public class Product {

    public enum ProductCategory {FOOD, CLOTHING, CANDY};

    private int id;
    private String name;
    private String description;
    private float price;
    private ProductCategory productCategory;

    public Product(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.productCategory = product.productCategory;
    }

    public Product(int id, String name, float price, ProductCategory productCategory){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
