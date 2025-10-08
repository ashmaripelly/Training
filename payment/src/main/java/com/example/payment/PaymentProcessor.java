package com.example.payment;

public class PaymentProcessor {
private PaymentMethod paymentMethod;

    // setter-based DI (easy to switch in XML)
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // bean lifecycle hooks
    public void init() {
        System.out.println("[PaymentProcessor:init] Using: " + paymentMethod.getName());
    }

    public void destroy() {
        System.out.println("[PaymentProcessor:destroy] Cleaning up resources…");
    }

    public void process(double amount) {
        paymentMethod.pay(amount);
        System.out.println("[PaymentProcessor] Done.");
    }
}
