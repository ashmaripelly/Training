package com.example.payment;

public class CreditCardPayment implements PaymentMethod {
    private String gateway = "Stripe"; // example property

    public void setGateway(String gateway) { this.gateway = gateway; }

    @Override public String getName() { return "CreditCard(" + gateway + ")"; }

    @Override
    public void pay(double amount) {
        System.out.println("[CreditCard] Charging $" + amount + " via " + gateway);
    }
}
