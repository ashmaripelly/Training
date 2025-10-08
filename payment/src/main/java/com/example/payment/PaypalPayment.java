package com.example.payment;

public class PaypalPayment implements PaymentMethod {
    @Override public String getName() { return "PayPal"; }

    @Override
    public void pay(double amount) {
        System.out.println("[PayPal] Sending $" + amount + " through PayPal");
    }
}
