package com.ansari.project.uber.uber.strategies.Impl;

import com.ansari.project.uber.uber.dto.RideRequestDto;
import com.ansari.project.uber.uber.strategies.RideFareCalculationStrategy;

public class RiderFareDefaultFareCalculation implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
