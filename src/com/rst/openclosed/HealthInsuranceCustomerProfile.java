package com.rst.openclosed;

import java.util.Random;

public class HealthInsuranceCustomerProfile implements CustomerProfile{

    @Override
    public boolean isLoyal() {
        return new Random().nextBoolean();
    }
}
