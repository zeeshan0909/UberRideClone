package com.ansari.project.uber.uber.strategies;

import com.ansari.project.uber.uber.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
