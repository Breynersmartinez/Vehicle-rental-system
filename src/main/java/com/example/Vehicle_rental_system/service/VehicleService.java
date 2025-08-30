package com.example.Vehicle_rental_system.service;



import com.example.Vehicle_rental_system.model.vehicle.Vehicle;
import com.example.Vehicle_rental_system.repository.VehicleRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional
public   class VehicleService
{

    private  VehicleRepository vehicleRepository;

    //Creacion de vehiulo usando factory pattern
    public Vehicle createVehicle(String typeVehicle, String plate, String brand,
                                 String model, int autonomy, String typeEnergy, Map<String, Object> specificParameters)
    {
        VehiculoFactory factory = VehiculoFactory.obtainFactory(typeVehicle);
        Vehicle vehicle = factory.createVehicle( typeVehicle,  plate,  brand,
                 model,  autonomy,  typeEnergy, specificParameters);
return vehicleRepository.save(vehicle);
    }

    //Obtener inventario como un arreglo
    public Vehicle[] getInventoryAsArray()
    {
       List<Vehicle> vehicles = vehicleRepository.findAll();
       return vehicles.toArray(new Vehicle[0]);
    }


    // Traer vehiclo por placa
    Optional<Vehicle> searchByPlate(String plate)
    {
        return vehicleRepository.findByPlate(plate);
    }

    //Traer todos los vehiculos disponibles
    List<Vehicle> getAviableVehicleOrdered()
    {
        return vehicleRepository.findByAviableTrueOrderByAutonomy();
    }

    // Cambiar las disponibilidad
    public void changeAbiability(int id, Boolean aviable )
    {
    vehicleRepository.findById(id).ifPresent(vehiculo  ->
    {
        vehiculo.setAviable(aviable);
        vehicleRepository.save(vehiculo);

    });
    }


}
