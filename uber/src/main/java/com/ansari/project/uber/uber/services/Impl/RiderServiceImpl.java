package com.ansari.project.uber.uber.services.Impl;

import com.ansari.project.uber.uber.dto.DriverDto;
import com.ansari.project.uber.uber.dto.RideDto;
import com.ansari.project.uber.uber.dto.RideRequestDto;
import com.ansari.project.uber.uber.dto.RiderDto;
import com.ansari.project.uber.uber.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRiders() {
        return List.of();
    }
}
