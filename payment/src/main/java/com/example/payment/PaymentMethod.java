package com.example.payment;

public interface PaymentMethod {
    String getName();
    void pay(double amount);
}
