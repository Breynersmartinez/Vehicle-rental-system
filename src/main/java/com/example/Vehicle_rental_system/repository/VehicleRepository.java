package com.example.Vehicle_rental_system.repository;

import com.example.Vehicle_rental_system.model.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface  VehicleRepository extends JpaRepository<Vehicle, Integer> {
Optional<Vehicle> findByPlate(String plate);
List<Vehicle> findByAviableTrueOrderByAutonomyDesc();
List<Vehicle> findByAviableTrue();

    @Query("SELECT v FROM VEHICULO v WHERE v.DISPONIBILIDAD = true ORDER BY v.AUTONOMIA DESC")
    List<Vehicle> findByAviableTrueOrderByAutonomy();
}
