package com.ansari.project.uber.uber.entities;

import com.ansari.project.uber.uber.entities.enums.PaymentsMethod;
import com.ansari.project.uber.uber.entities.enums.RideRequestStatus;
import com.ansari.project.uber.uber.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class RideRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickupLocation;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime requestedTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @Enumerated(EnumType.STRING)
    private PaymentsMethod paymentsMethod;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

}