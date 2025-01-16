package com.ansari.project.uber.uber.strategies;

import com.ansari.project.uber.uber.dto.RideRequestDto;
import com.ansari.project.uber.uber.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

     List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
