package com.ansari.project.uber.uber.entities;


import com.ansari.project.uber.uber.entities.enums.PaymentMethod;
import com.ansari.project.uber.uber.entities.enums.PaymentStatus;
import jakarta.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @OneToOne(fetch = FetchType.LAZY)
    private Ride ride;

    private Double amount;

    @OneToOne(fetch = FetchType.LAZY)
    private PaymentStatus paymentStatus;

}
