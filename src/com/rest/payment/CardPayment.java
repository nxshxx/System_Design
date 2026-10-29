package com.rest.payment;

public class CardPayment {

    public boolean pay(double amount) {
        System.out.println("Card payment successful.");
        System.out.println("Amount: Rs. " + amount);

        return true;
    }
}