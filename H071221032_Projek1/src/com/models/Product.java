package com.models;

public class Product {
    private int id;
    private String name;
    private long price;
    private int ammount;

    public Product(int id, String name, long price, int ammount ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.ammount = ammount;
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
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public int getAmmount() {
        return ammount;
    }
    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
}
