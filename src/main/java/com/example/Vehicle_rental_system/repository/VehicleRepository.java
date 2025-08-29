package com.example.Vehicle_rental_system.repository;

import com.example.Vehicle_rental_system.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  VehicleRepository extends JpaRepository<Vehicle, Integer> {



}
