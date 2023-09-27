package com.sda.dpagp.day3.facade;

import com.sda.dpagp.day3.facade.externalservice.DeliveryService;
import com.sda.dpagp.day3.facade.externalservice.PaymentService;
import com.sda.dpagp.day3.facade.externalservice.ProductAvailabilityService;

public class ExternalServiceFacade {

    // 1. has references to "services" that are going to be used
    // and hidden behind the facade.
    // In our app, this service represent a 3rd party system that allows online orders. E.g. EMag
    private DeliveryService deliveryService;
    private PaymentService paymentService;
    private ProductAvailabilityService productAvailabilityService;


    // 2. received dependencies to these services through constructor
    public ExternalServiceFacade(DeliveryService deliveryService, PaymentService paymentService, ProductAvailabilityService productAvailabilityService) {
        this.deliveryService = deliveryService;
        this.paymentService = paymentService;
        this.productAvailabilityService = productAvailabilityService;
    }


    // 3. expose a new method that does all the logic and hides the multiple calls to external service
    public void order(long productId, int quantity, String recipient) {
        if (productAvailabilityService.isAvailable(productId)) {
            paymentService.pay(productId, quantity);
            deliveryService.deliver(productId, quantity, recipient);
        } else {
            throw new RuntimeException("Product out of stock!"); // logger.error("")
        }
    }
}
