package com.rst.openclosed;

public class InsurancePremiumDiscountCalculator {

    public int calculatePremiumDiscount(CustomerProfile customer){
        if (customer.isLoyal()){
            return 20;
        }
        return 0;
    }


}
