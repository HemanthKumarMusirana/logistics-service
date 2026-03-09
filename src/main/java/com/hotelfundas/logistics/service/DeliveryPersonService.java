package com.hotelfundas.logistics.service;

import com.hotelfundas.logistics.dto.CreateDeliveryPersonRequest;
import com.hotelfundas.logistics.entity.DeliveryPerson;
import com.hotelfundas.logistics.repository.DeliveryPersonRepository;
import org.springframework.stereotype.Service;

@Service
public class DeliveryPersonService {

    private final DeliveryPersonRepository deliveryPersonRepository;

    public DeliveryPersonService(DeliveryPersonRepository deliveryPersonRepository) {
        this.deliveryPersonRepository = deliveryPersonRepository;
    }

    public DeliveryPerson createDeliveryPerson(CreateDeliveryPersonRequest request) {

        DeliveryPerson person = new DeliveryPerson();

        person.setName(request.getName());
        person.setArea(request.getArea());
        person.setIsactive(request.getIsActive() != null ? request.getIsActive() : true); // Default to true if not provided
        person.setVehicleId(request.getVehicleId());

        return deliveryPersonRepository.save(person);
    }
}