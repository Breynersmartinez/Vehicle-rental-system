package com.example.Vehicle_rental_system.model.vehicle;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public abstract class VehicleFactory {


    public abstract Vehicle createVehicle(String typeVehicle, String plate, String brand,
                                          String model, int autonomy, String typeEnergy, Map<String, Object> specificParameters);

    public static VehicleFactory obtainFactory(String typeVehicle)
    {
        switch (typeVehicle.toUpperCase())
        {
            case "AUTO":
                return new CarFactory();
            case "VAN":
                return new VanFactory();
            case "CAMION":
                return new TruckFactory();
            default:
                throw new IllegalArgumentException("Tipo de vehículo no válido: " + typeVehicle);
        }
    }




}
