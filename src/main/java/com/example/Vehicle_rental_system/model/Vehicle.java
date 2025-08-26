package com.example.Vehicle_rental_system.model;

import com.example.Vehicle_rental_system.adit.Auditable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "VEHICLE")
public abstract class Vehicle extends Auditable {
    @id
    @Column (name = "ID")
    protected Integer id;

    @Column(name = "PLACA")
    protected String plate;

    @Column(name = "MARCA")
    protected String brand;

    @Column(name = "MODELO")
    protected String model;

    @Column(name = "AUTONOMIA")
    protected int autonomy;

    @Column(name = "TIPO_ENERGIA")
    protected String typeEnergy;

    @Column(name = "DISPONIBILIDAD")
    protected Boolean aviable; //disponiblilidad

// metodos abstractos de la clase

    public abstract String getType();
    public abstract Vehicle clone();

    // metodos getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getAviable() {
        return aviable;
    }

    public void setAviable(Boolean aviable) {
        this.aviable = aviable;
    }

    public String getTypeEnergy() {
        return typeEnergy;
    }

    public void setTypeEnergy(String typeEnergy) {
        this.typeEnergy = typeEnergy;
    }

    public int getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(int autonomy) {
        this.autonomy = autonomy;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
