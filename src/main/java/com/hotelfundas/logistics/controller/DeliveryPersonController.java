package com.hotelfundas.logistics.controller;

import com.hotelfundas.logistics.dto.CreateDeliveryPersonRequest;
import com.hotelfundas.logistics.entity.DeliveryPerson;
import com.hotelfundas.logistics.service.DeliveryPersonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery-person")
public class DeliveryPersonController {

    private final DeliveryPersonService deliveryPersonService;

    public DeliveryPersonController(DeliveryPersonService deliveryPersonService) {
        this.deliveryPersonService = deliveryPersonService;
    }

    @PostMapping
    public DeliveryPerson createDeliveryPerson(@RequestBody CreateDeliveryPersonRequest request) {
        return deliveryPersonService.createDeliveryPerson(request);
    }
}