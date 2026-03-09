package com.hotelfundas.logistics.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import javax.xml.transform.sax.SAXResult;
import java.time.LocalDateTime;

@Entity
@Data
public class OrderDelivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderId;
    private Long customerId;
    private String customerdetails;
    private String deliveryAddress;
    private String deliveryStatus;
    private LocalDateTime exceptedDeliveryDateTime;
    private LocalDateTime actualDeliveryDateTime;
    private String remarks;

}
