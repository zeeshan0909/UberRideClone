package com.ansari.project.uber.uber.dto;

import com.ansari.project.uber.uber.entities.Rider;
import com.ansari.project.uber.uber.entities.enums.PaymentMethod;
import com.ansari.project.uber.uber.entities.enums.RideStatus;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {

    private Long id;
    private Point pickUpLocation;
    private Point dropOffLocation;
    private LocalDateTime createdTime;
    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;


}
