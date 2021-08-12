package com.rst;

import com.rst.openclosed.HealthInsuranceCustomerProfile;
import com.rst.openclosed.HomeInsuranceCustomerProfile;
import com.rst.openclosed.InsurancePremiumDiscountCalculator;
import com.rst.openclosed.VehicleInsuranceCustomerProfile;

public class Main {

    public static void main(String[] args) {

        InsurancePremiumDiscountCalculator calculator = new InsurancePremiumDiscountCalculator();

        HealthInsuranceCustomerProfile profile1 = new HealthInsuranceCustomerProfile();
        VehicleInsuranceCustomerProfile profile2 = new VehicleInsuranceCustomerProfile();
        HomeInsuranceCustomerProfile profile3 = new HomeInsuranceCustomerProfile();

        int discount = calculator.calculatePremiumDiscount(profile1);
        System.out.println(discount);
        int vdiscount = calculator.calculatePremiumDiscount(profile2);
        System.out.println(vdiscount);

        int homediscount = calculator.calculatePremiumDiscount(profile3);
        System.out.println(homediscount);

    }
}
