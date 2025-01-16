package com.ansari.project.uber.uber.strategies.impl;

import com.ansari.project.uber.uber.dto.RideRequestDto;
import com.ansari.project.uber.uber.strategies.RideFareCalculationStrategy;

public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
