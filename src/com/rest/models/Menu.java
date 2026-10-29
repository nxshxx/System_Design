package com.rest.models;

public class Menu {

    public enum Category {
        starter, mainCourse, dessert, drink
    }

    private int id;
    private String name;
    private double price;
    private Category type;

    public Menu(int id, String name, double price, Category type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(Category type) {
        this.type = type;
    }
}