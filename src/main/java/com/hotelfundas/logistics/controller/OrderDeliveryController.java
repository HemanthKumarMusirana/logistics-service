package com.hotelfundas.logistics.controller;

import com.hotelfundas.logistics.dto.ChangeOrderStatusRequest;
import com.hotelfundas.logistics.dto.CreateOrderDeliveryRequest;
import com.hotelfundas.logistics.entity.OrderDelivery;
import com.hotelfundas.logistics.service.OrderDeliveryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order-delivery")
public class OrderDeliveryController {

    private final OrderDeliveryService orderDeliveryService;

    public OrderDeliveryController(OrderDeliveryService orderDeliveryService) {
        this.orderDeliveryService = orderDeliveryService;
    }

    @PostMapping
    public OrderDelivery createOrderDelivery(@RequestBody CreateOrderDeliveryRequest request) {
        return orderDeliveryService.createOrderDelivery(request);
    }

    @PutMapping("/status")
    public OrderDelivery changeOrderStatus(@RequestBody ChangeOrderStatusRequest request) {
        return orderDeliveryService.changeOrderStatus(request);
    }

    @GetMapping("/{id}")
    public OrderDelivery getOrderDeliveryById(@PathVariable Long id) {
        return orderDeliveryService.getOrderDeliveryById(id);
    }
}