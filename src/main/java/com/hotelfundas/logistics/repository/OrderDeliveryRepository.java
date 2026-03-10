package com.hotelfundas.logistics.repository;

import com.hotelfundas.logistics.entity.OrderDelivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDeliveryRepository extends JpaRepository<OrderDelivery, Long> {
}