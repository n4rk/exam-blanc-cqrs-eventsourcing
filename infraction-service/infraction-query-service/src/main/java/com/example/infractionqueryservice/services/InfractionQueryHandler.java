package com.example.infractionqueryservice.services;

import com.example.infractionqueryservice.entities.Infraction;
import com.example.infractionqueryservice.repositories.InfractionRepository;
import commonapi.GetInfractionsByNationalCardNumber;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class InfractionQueryHandler {
    private InfractionRepository infractionRepository;

    public InfractionQueryHandler(InfractionRepository contraventionRepository) {
        this.infractionRepository = contraventionRepository;
    }

    @QueryHandler
    public Page on(GetInfractionsByNationalCardNumber query){
        return infractionRepository.findAllByOwnerNationalCardId(query.getOwnerNationalCardId(), PageRequest.of(query.getPage(), query.getSize()));
    }
    public Page getinfractions(GetInfractionsByNationalCardNumber query){
        return infractionRepository.findAllByOwnerNationalCardId(query.getOwnerNationalCardId(), PageRequest.of(query.getPage(), query.getSize()));
    }
}