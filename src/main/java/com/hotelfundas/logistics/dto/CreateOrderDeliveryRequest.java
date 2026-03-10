package com.hotelfundas.logistics.dto;

import lombok.Data;

@Data
public class CreateOrderDeliveryRequest {

    private Long orderId;

    private Long customerId;

    private String customerDetails;

    private String deliveryAddress;

    private Long deliveryPersonId;

    private String remarks;
}