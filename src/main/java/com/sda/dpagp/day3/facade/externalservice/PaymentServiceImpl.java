package com.sda.dpagp.day3.facade.externalservice;

public class PaymentServiceImpl implements PaymentService{
    @Override
    public void pay(long productId, int amount) {
        System.out.println("The product "+productId+" was paid!");
    }
}
