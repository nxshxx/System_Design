package com.rest.payment;

public class CashPayment {

    public boolean pay(double amount) {
        System.out.println("Cash payment successful.");
        System.out.println("Amount: Rs. " + amount);

        return true;
    }
}
