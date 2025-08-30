package com.example.Vehicle_rental_system.model.vehicle;

import org.springframework.stereotype.Component;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

@Component
public  CarFactory extends VehicleFactory{

    @Override
    public VehicleFactory createVehicle(String typeVehicle, String plate, String brand,
            String model, int autonomy, String typeEnergy, Map<String, Object> specificParameters)
    {

 Integer doors = (Integer) specificParameters.getOrDefault("numeroPuertas", 4);
 return new Car( typeVehicle,  plate,  brand,
          model,  autonomy,  typeEnergy, specificParameters, doors);
    }

}
