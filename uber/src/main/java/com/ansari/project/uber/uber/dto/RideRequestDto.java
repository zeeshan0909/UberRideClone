package com.ansari.project.uber.uber.dto;

import com.ansari.project.uber.uber.entities.Rider;
import com.ansari.project.uber.uber.entities.enums.PaymentsMethod;
import com.ansari.project.uber.uber.entities.enums.RideRequestStatus;
import com.ansari.project.uber.uber.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime requestedTime;
    private Rider rider;
    private PaymentsMethod paymentsMethod;
    private RideRequestStatus rideRequestStatus;

}
