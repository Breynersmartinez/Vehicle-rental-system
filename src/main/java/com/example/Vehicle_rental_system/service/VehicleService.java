package com.example.Vehicle_rental_system.service;



import com.example.Vehicle_rental_system.model.Vehicle;
import com.example.Vehicle_rental_system.repository.VehicleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public   class VehicleService {


    private final VehicleRepository vehicleRepository;

    @Autowired
    private final ModelMapper modelMapper;

    public VehicleService(VehicleRepository vehicleRepository, ModelMapper modelMapper)
    {
        this.vehicleRepository = vehicleRepository;
        this.modelMapper = modelMapper;
    }




    public  List<Vehicle> getVehicle()
    {
        return vehicleRepository.findAll();
    }


    public  Optional<Vehicle> getVehicle(Integer id)
    {
        return vehicleRepository.findById(id);
    }


    public  void saveOrUpdate(Vehicle vehicle)
    {
        vehicleRepository.save(vehicle);
    }


    public void delete(Integer id)
    {
        vehicleRepository.deleteById(id);
    }



}
