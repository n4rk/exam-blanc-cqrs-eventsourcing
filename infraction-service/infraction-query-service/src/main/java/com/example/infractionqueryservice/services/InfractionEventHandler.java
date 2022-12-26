package com.example.infractionqueryservice.services;
import com.example.infractionqueryservice.entities.Infraction;
import com.example.infractionqueryservice.repositories.InfractionRepository;

import commonapi.InfractionCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Slf4j
@Transactional
public class InfractionEventHandler {
    private InfractionRepository infractionRepository;

    public InfractionEventHandler(InfractionRepository infractionRepository) {
        this.infractionRepository = infractionRepository;
    }
    @EventHandler
    public void on(InfractionCreatedEvent event){
        Infraction infraction=new Infraction();
        infraction.setInfractionId(event.getId());
        infraction.setAmount(event.getPayload().getAmount());
        infraction.setInstant(event.getPayload().getTimeStamp());
        infraction.setOwnerAddress(event.getPayload().getOwnerAddress());
        infraction.setOwnerEmail(event.getPayload().getOwnerEmail());
        infraction.setOwnerNationalCardId(event.getPayload().getOwnerNationalCardId());
        infraction.setRadarLong(event.getPayload().getRadarLongitude());
        infraction.setOwnerPhoneNumber(event.getPayload().getOwnerPhoneNumber());
        infraction.setRadarId(event.getPayload().getRadarId());
        infraction.setRadarMaxSpeed(event.getPayload().getRadarMaxSpeed());
        infraction.setStatus(event.getPayload().getStatus());
        infraction.setVehicleOwner(event.getPayload().getVehicleOwner());
        infraction.setVehicleRegistrationNumber(event.getPayload().getVehicleRegistrationNumber());
        infraction.setVehicleSpeed(event.getPayload().getVehicleSpeed());
        infractionRepository.save(infraction);
    }

}
