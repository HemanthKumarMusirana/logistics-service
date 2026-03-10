package com.hotelfundas.logistics.service;

import com.hotelfundas.logistics.dto.ChangeOrderStatusRequest;
import com.hotelfundas.logistics.dto.CreateOrderDeliveryRequest;
import com.hotelfundas.logistics.entity.OrderDelivery;
import com.hotelfundas.logistics.repository.OrderDeliveryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderDeliveryService {

    private final OrderDeliveryRepository orderDeliveryRepository;

    public OrderDeliveryService(OrderDeliveryRepository orderDeliveryRepository) {
        this.orderDeliveryRepository = orderDeliveryRepository;
    }

    public OrderDelivery createOrderDelivery(CreateOrderDeliveryRequest request) {

        OrderDelivery delivery = new OrderDelivery();

        delivery.setOrderId(request.getOrderId());
        delivery.setCustomerId(request.getCustomerId());
        delivery.setCustomerDetails(request.getCustomerDetails());
        delivery.setDeliveryAddress(request.getDeliveryAddress());
        delivery.setRemarks(request.getRemarks());

        delivery.setDeliveryStatus("CREATED");
        delivery.setExpectedDeliveryDateTime(LocalDateTime.now().plusHours(2));

        return orderDeliveryRepository.save(delivery);
    }

    public OrderDelivery changeOrderStatus(ChangeOrderStatusRequest request) {

        OrderDelivery delivery = orderDeliveryRepository
                .findById(request.getOrderDeliveryId())
                .orElseThrow(() -> new RuntimeException("Order not found"));

        delivery.setDeliveryStatus(request.getStatus());

        if ("DELIVERED".equalsIgnoreCase(request.getStatus())) {
            delivery.setActualDeliveryDateTime(LocalDateTime.now());
        }

        return orderDeliveryRepository.save(delivery);

    }
    public OrderDelivery getOrderDeliveryById(Long id) {

        return orderDeliveryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order delivery not found"));
    }

    public String getOrderStatus(Long orderId) {

        OrderDelivery delivery = orderDeliveryRepository
                .findByOrderId(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        return delivery.getDeliveryStatus();
    }

}