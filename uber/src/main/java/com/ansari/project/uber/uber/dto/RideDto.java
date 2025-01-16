package com.ansari.project.uber.uber.dto;

import com.ansari.project.uber.uber.entities.Driver;
import com.ansari.project.uber.uber.entities.Rider;
import com.ansari.project.uber.uber.entities.enums.PaymentsMethod;
import com.ansari.project.uber.uber.entities.enums.RideRequestStatus;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime createdTime;
    private RiderDto riderDto;
    private DriverDto driverDto;
    private RideRequestStatus rideStatus;
    private PaymentsMethod paymentsMethod;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}
