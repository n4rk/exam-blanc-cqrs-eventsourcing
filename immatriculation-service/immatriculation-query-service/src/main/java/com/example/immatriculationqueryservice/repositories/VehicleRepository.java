package com.example.immatriculationqueryservice.repositories;

import com.example.immatriculationqueryservice.entities.Vehicle;
import com.example.immatriculationqueryservice.entities.VehicleOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {
    Vehicle findVehicleByOwner(VehicleOwner vehicleOwner);
}
