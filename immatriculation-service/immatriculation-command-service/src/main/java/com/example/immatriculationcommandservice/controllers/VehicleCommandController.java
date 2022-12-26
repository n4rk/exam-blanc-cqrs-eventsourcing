package com.example.immatriculationcommandservice.controllers;

import commonapi.CreateVehicleCommand;
import commonapi.UpdateVehicleOwnerCommand;
import commonapi.UpdateVehicleOwnerRequestDTO;
import commonapi.VehicleRequestDTO;
import lombok.extern.slf4j.Slf4j;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@Slf4j
@RequestMapping("/commands")
@CrossOrigin("*")
public class VehicleCommandController {
    private CommandGateway commandGateway;

    public VehicleCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping("/vehicles/create")
    public CompletableFuture<String> createNewVehicle(@RequestBody VehicleRequestDTO request){
        return this.commandGateway.send(new CreateVehicleCommand(
           request.getRegistrationNumber(),
           request
        ));
    }
    @PutMapping("/vehicles/updateOwner")
    public CompletableFuture<String> updateOwner(@RequestBody UpdateVehicleOwnerRequestDTO request){
        return this.commandGateway.send(new UpdateVehicleOwnerCommand(
                request.getRegistrationNumber(),
                request
        ));
    }
}
