package com.example.Vehicle_rental_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("AUTO")
public class Car extends Vehicle{
    @Column
    private int numberDoors;


    public Car() {}


    public Car(int numberDoors, int id, String plate, String brand, String model, int autonomy, String typeEnergy, Boolean aviable)
    {
        super(id,  plate,  brand,  model,  autonomy,  typeEnergy,  aviable);
        this.numberDoors = numberDoors;
    }



    // metodos abstractos de la clase
    @Override
    public  String getType()
    {
        return "Car";
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }
}
