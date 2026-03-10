package com.hotelfundas.logistics.repository;

import com.hotelfundas.logistics.entity.OrderDelivery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderDeliveryRepository extends JpaRepository<OrderDelivery, Long> {
    Optional<OrderDelivery> findByOrderId(Long orderId);
}