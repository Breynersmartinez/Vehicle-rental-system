package com.example.Vehicle_rental_system.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "CLIENTE")
public class Client {

    @Id
    @Column (name = "IDENTIFICACION")
    @NotBlank (message = " Campo obligatio, por favor digite su cedula")
    private Integer idCard;

    @Column (name = "NOMBRE")
    @NotBlank(message = "Campo obligatorio")
    private String name;

    @Column (name = "TIPO_CLIENTE")
    private String TypeClient;

    public Client(Integer idCard, String name, String typeClient) {
        this.idCard = idCard;
        this.name = name;
        TypeClient = typeClient;
    }


    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeClient() {
        return TypeClient;
    }

    public void setTypeClient(String typeClient) {
        TypeClient = typeClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idCard=" + idCard +
                ", name='" + name + '\'' +
                ", TypeClient='" + TypeClient + '\'' +
                '}';
    }
}
