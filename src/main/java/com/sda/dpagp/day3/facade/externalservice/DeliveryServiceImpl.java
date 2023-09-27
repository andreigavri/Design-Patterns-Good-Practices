package com.sda.dpagp.day3.facade.externalservice;

public class DeliveryServiceImpl implements DeliveryService{
    @Override
    public void deliver(long productId, int quantity, String recipient) {
        System.out.println("Delivering product "+productId+" to "+recipient);
    }
}
