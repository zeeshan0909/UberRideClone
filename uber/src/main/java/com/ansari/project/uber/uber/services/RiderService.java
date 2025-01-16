package com.ansari.project.uber.uber.services;

import com.ansari.project.uber.uber.dto.DriverDto;
import com.ansari.project.uber.uber.dto.RideDto;
import com.ansari.project.uber.uber.dto.RideRequestDto;
import com.ansari.project.uber.uber.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();//driver id come from the spring security;

    List<RideDto> getAllMyRides();

}
