package com.example.Vehicle_rental_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Van extends Vehicle {

    @Column
    private int passengerCpacity;

    public Van()
    {

    }

    public Van(int passengerCpacity, int id, String plate, String brand, String model, int autonomy, String typeEnergy, Boolean aviable)
    {
        super(id,  plate,  brand,  model,  autonomy,  typeEnergy,  aviable);
        this.passengerCpacity = passengerCpacity;
    }

       @Override
    public  String getType()
    {
        return "Van";
    }

    public int getPassengerCpacity() {
        return passengerCpacity;
    }

    public void setPassengerCpacity(int passengerCpacity) {
        this.passengerCpacity = passengerCpacity;
    }
}
