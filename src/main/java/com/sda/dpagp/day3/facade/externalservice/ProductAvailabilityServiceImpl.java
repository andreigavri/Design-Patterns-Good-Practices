package com.sda.dpagp.day3.facade.externalservice;

public class ProductAvailabilityServiceImpl implements ProductAvailabilityService{
    @Override
    public boolean isAvailable(long productId) {
        return true;
    }
}
