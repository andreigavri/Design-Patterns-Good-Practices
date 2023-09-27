package com.sda.dpagp.day3.facade;

import com.sda.dpagp.day3.facade.externalservice.DeliveryServiceImpl;
import com.sda.dpagp.day3.facade.externalservice.PaymentServiceImpl;
import com.sda.dpagp.day3.facade.externalservice.ProductAvailabilityServiceImpl;

public class FacadeExample {

    public static void main(String[] args) {
        // dependencies will be resolved by Spring
        ExternalServiceFacade facade = new ExternalServiceFacade(new DeliveryServiceImpl(), new PaymentServiceImpl(), new ProductAvailabilityServiceImpl());
        facade.order(100, 10, "Florin");

    }
}
