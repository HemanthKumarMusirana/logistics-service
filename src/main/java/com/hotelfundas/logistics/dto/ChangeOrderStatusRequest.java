package com.hotelfundas.logistics.dto;

import lombok.Data;

@Data
public class ChangeOrderStatusRequest {

    private Long orderDeliveryId;

    private String status;

}