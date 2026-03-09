package com.hotelfundas.logistics.dto;
import jakarta.validation.constraints.NotNull;

import lombok.Data;
import lombok.Data;
@Data
public class CreateDeliveryPersonRequest {
    private String name;
    private Boolean IsActive;
    private String area;
    private Long vehicleId;
}
