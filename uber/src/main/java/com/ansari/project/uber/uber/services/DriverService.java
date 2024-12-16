package com.ansari.project.uber.uber.services;

import com.ansari.project.uber.uber.dto.DriverDto;
import com.ansari.project.uber.uber.dto.RideDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RideDto rateRider(Long rideId);

    //in blow method we don't provide the driver id
    //because driver id come form spring security context
    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();

}
