package com.example.Vehicle_rental_system.model.vehicle;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CAMION")
public class Truck extends Vehicle{
    @Column (name = "CAPACIDAD_DE_CARGA")
    private Double loadCapacity;

    public Truck ()
    {

    }

    public Truck (String typeVehicle, int id, String plate, String brand, String model, int autonomy, String typeEnergy, Boolean aviable)
    {
        super(typeVehicle, id,  plate,  brand,  model,  autonomy,  typeEnergy,  aviable);
        this.loadCapacity = loadCapacity;
    }



@Override
    public String getType()
{
    return  "Truck";
}

    public Double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
