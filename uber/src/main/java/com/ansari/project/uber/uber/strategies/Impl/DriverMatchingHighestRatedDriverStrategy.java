package com.ansari.project.uber.uber.strategies.Impl;

import com.ansari.project.uber.uber.dto.RideRequestDto;
import com.ansari.project.uber.uber.entities.Driver;
import com.ansari.project.uber.uber.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
