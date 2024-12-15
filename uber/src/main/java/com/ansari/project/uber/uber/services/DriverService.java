package com.ansari.project.uber.uber.services;

import com.ansari.project.uber.uber.dto.RideDto;

public interface DriverService {

    RideDto cancleRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

}
