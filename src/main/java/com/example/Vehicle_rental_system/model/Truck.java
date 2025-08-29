package com.example.Vehicle_rental_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Truck extends Vehicle{
    @Column
    private Double loadCapacity;

    public Truck ()
    {

    }

    public Truck (int id, String plate, String brand, String model, int autonomy, String typeEnergy, Boolean aviable)
    {
        super(id,  plate,  brand,  model,  autonomy,  typeEnergy,  aviable);
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
