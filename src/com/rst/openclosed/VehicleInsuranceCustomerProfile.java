package com.rst.openclosed;

import java.util.Random;

public class VehicleInsuranceCustomerProfile implements CustomerProfile{

    public boolean isLoyal() {
        return new Random().nextBoolean();
    }
}
