package com.example.Vehicle_rental_system.model.vehicle;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("VAN")
public class Van extends Vehicle {

    @Column (name = "CAPACIDAD_DE_PASAJEROS")
    private int passengerCapacity;

    public Van()
    {

    }

    public Van(String typeVehicle, int passengerCapacity, int id, String plate, String brand, String model, int autonomy, String typeEnergy, Boolean aviable)
    {
        super(typeVehicle, id,  plate,  brand,  model,  autonomy,  typeEnergy,  aviable);
        this.passengerCapacity = passengerCapacity;
    }

       @Override
    public  String getType()
    {
        return "Van";
    }

    public int getPassengerCpacity() {
        return passengerCapacity;
    }

    public void setPassengerCpacity(int passengerCpacity) {
        this.passengerCapacity = passengerCpacity;
    }
}
