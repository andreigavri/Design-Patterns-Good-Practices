package com.sda.dpagp.day3.facade.externalservice;

public interface DeliveryService {

    void deliver(long productId, int quantity, String recipient);
}
