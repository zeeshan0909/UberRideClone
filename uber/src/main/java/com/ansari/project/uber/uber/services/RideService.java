package com.ansari.project.uber.uber.services;

import com.ansari.project.uber.uber.dto.RideRequestDto;
import com.ansari.project.uber.uber.entities.Driver;
import com.ansari.project.uber.uber.entities.Ride;
import com.ansari.project.uber.uber.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRideOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRideOfDriver(Long driverId, PageRequest pageRequest);



}
