package com.hotelfundas.logistics.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DeliveryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderdeliveryId;
    private String productname;
    private Integer orderedquantity;
    private Integer deliveredquantity;
    private String reason;
}
