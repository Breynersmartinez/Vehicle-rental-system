package com.example.Vehicle_rental_system.model.vehicle;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TruckFactory extends VehicleFactory {

    @Override
    public VehicleFactory createVehicle(String typeVehicle, String plate, String brand,
                                 String model, int autonomy, String typeEnergy, Map<String, Object> specificParameters )
    {
        Integer loadCapacity = (Integer) specificParameters.getOrDefault("Capacidad de carga", 16.5);
        return new Car( typeVehicle,  plate,  brand,
                model,  autonomy,  typeEnergy, specificParameters, loadCapacity);

    }

}
