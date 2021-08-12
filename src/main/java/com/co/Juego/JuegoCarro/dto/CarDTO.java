package com.co.Juego.JuegoCarro.dto;

import org.springframework.data.annotation.Id;
public class CarDTO {

    private String idCar;

    // @NotBlank
    private String idDriver;
    private String arrivalGoal;
    private String idLane;

    public CarDTO(String idCar, String idDriver, String arrivalGoal, String idLane) {
        this.idCar = idCar;
        this.idDriver = idDriver;
        this.arrivalGoal = arrivalGoal;
        this.idLane = idLane;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public String getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(String idDriver) {
        this.idDriver = idDriver;
    }

    public String getArrivalGoal() {
        return arrivalGoal;
    }

    public void setArrivalGoal(String arrivalGoal) {
        this.arrivalGoal = arrivalGoal;
    }

    public String getIdLane() {
        return idLane;
    }

    public void setIdLane(String idLane) {
        this.idLane = idLane;
    }
}
