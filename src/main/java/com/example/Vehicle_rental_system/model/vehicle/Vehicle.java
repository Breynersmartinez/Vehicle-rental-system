package com.example.Vehicle_rental_system.model.vehicle;

import com.example.Vehicle_rental_system.adit.Auditable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "VEHICULO")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO_VEHICULO", discriminatorType = DiscriminatorType.STRING)

public  abstract class Vehicle extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;


    @Column(name = "PLACA", unique = true, nullable = false)
    @NotBlank(message = "La placa es obligatoria")
    @Pattern(regexp = "^[A-Z]{3}\\d{3}$", message = "Formato de placa inválido (ej: ABC123)")
    protected String plate;

    @NotBlank(message = "La marca es obligatoria")
    @Column(name = "MARCA")
    protected String brand;

    @NotBlank(message = "El modelo es obligatorio")
    @Column(name = "MODELO")
    protected String model;

    @NotBlank(message = "La autonomia debe ser > 0")
    @Max(value = 1000, message = "La autonomía no puede exceder 1000 km")
    @Column(name = "AUTONOMIA")
    protected int autonomy;

    @NotBlank(message = "El tipo de energia es obligatoria")
    @Column(name = "TIPO_ENERGIA")
    protected String typeEnergy;

    @NotBlank(message = "LA disponibilidad es obligatorio")
    @Column(name = "DISPONIBILIDAD")
    protected Boolean aviable = true; //disponiblilidad

    @NotBlank(message = "El tipo de vehiculo es obligatorio")
    @Column(name = "TIPO_VEHICULO")
    protected String typeVehicle ; //disponiblilidad


    //Constructor protegido para factory
    protected Vehicle()
    {

    }

    public Vehicle(String typeVehicle, int id, String plate, String brand, String model, int autonomy, String typeEnergy, Boolean aviable) {
        this.id = id;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.autonomy = autonomy;
        this.typeEnergy = typeEnergy;
        this.aviable = aviable;
        this.typeVehicle = typeVehicle;

    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public abstract String getType();

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
