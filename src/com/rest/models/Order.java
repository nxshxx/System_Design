package com.rest.models;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public enum Status {
        pending, preparing, served, cancelled
    }

    private int id;
    private int tableId;
    private List<MenuItems> items = new ArrayList<>();
    private double totalAmount;
    private Status status;
    private boolean paid;

    public Order(int id, int tableId, double totalAmount, Status status) {
        this.id = id;
        this.tableId = tableId;
        this.totalAmount = totalAmount;
        this.status = status;
        this.paid = false;
    }

    public void addItem(MenuItems newItem) {
        items.add(newItem);
        calculateTotal();
    }

    private void calculateTotal() {
        totalAmount = 0;

        for (MenuItems item : items) {
            totalAmount += item.getSubtotal();
        }
    }

    public int getId() {
        return id;
    }

    public int getTableId() {
        return tableId;
    }

    public List<MenuItems> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}