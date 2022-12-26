package com.example.immatriculationqueryservice.controllers;


import com.example.immatriculationqueryservice.entities.Vehicle;
import com.example.immatriculationqueryservice.entities.VehicleOwner;
import commonapi.GetAllOwners;
import commonapi.GetAllVehiclesQuery;
import commonapi.GetVehicleByRegistrationNumber;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@Slf4j
@RequestMapping("/query")
@CrossOrigin("*")
public class VehicleRegistrationQueryController {
    private QueryGateway queryGateway;

    public VehicleRegistrationQueryController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }
    @GetMapping("/vehicles/all")
    public CompletableFuture<List<Vehicle>> getVehicules(){
        return queryGateway.query(
                new GetAllVehiclesQuery(),
                ResponseTypes.multipleInstancesOf(Vehicle.class)
        );
    }
    @GetMapping("/vehicles/owners")
    public CompletableFuture<List<VehicleOwner>> getOwners(){
        return queryGateway.query(
                new GetAllOwners(),
                ResponseTypes.multipleInstancesOf(VehicleOwner.class)
        );
    }
    @GetMapping("/vehicles/byRegNumber/{regNumber}")
    public CompletableFuture<Vehicle> getVehiculeByRegNumber(@PathVariable String regNumber){
        return queryGateway.query(
                new GetVehicleByRegistrationNumber(regNumber),
                ResponseTypes.instanceOf(Vehicle.class)
        );
    }
}
