package com.ansari.project.uber.uber.services;

import com.ansari.project.uber.uber.dto.DriverDto;
import com.ansari.project.uber.uber.dto.RideDto;
import com.ansari.project.uber.uber.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();//driver id come from the spring security;

    List<RideDto> getAllMyRides();
}
