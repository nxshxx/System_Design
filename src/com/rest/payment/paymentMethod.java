package com.rest.payment;

public class paymentMethod{

    private double amount;
    private String method;

    public paymentMethod(double amount, String method) {
        this.amount = amount;
        this.method = method;
    }

    public double getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }
}