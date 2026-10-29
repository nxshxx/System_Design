package com.rest.payment;

public class UpiPayment {

    public boolean pay(double amount) {
        System.out.println("UPI payment successful.");
        System.out.println("Amount: Rs. " + amount);

        return true;
    }
}
