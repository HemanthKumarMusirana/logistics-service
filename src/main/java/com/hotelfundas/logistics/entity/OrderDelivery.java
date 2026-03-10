package com.hotelfundas.logistics.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "order_delivery")
@Data
public class OrderDelivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;

    private Long customerId;

    private String customerDetails;

    private String deliveryAddress;

    private String deliveryStatus;

    private String remarks;

    @Column(name = "expected_delivery_date_time")
    private LocalDateTime expectedDeliveryDateTime;

    @Column(name = "actual_delivery_date_time")
    private LocalDateTime actualDeliveryDateTime;
}