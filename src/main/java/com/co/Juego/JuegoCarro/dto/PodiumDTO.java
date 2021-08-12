package com.co.Juego.JuegoCarro.dto;


public class PodiumDTO {

    private String idPodium;

    // @NotBlank
    private String idDriver;
    private String firstPlace;
    private String secondPlace;
    private String thirdPlace;

    public PodiumDTO(String idPodium, String idDriver, String firstPlace, String secondPlace, String thirdPlace) {
        this.idPodium = idPodium;
        this.idDriver = idDriver;
        this.firstPlace = firstPlace;
        this.secondPlace = secondPlace;
        this.thirdPlace = thirdPlace;
    }

    public String getIdPodium() {
        return idPodium;
    }

    public void setIdPodium(String idPodium) {
        this.idPodium = idPodium;
    }

    public String getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(String idDriver) {
        this.idDriver = idDriver;
    }

    public String getFirstPlace() {
        return firstPlace;
    }

    public void setFirstPlace(String firstPlace) {
        this.firstPlace = firstPlace;
    }

    public String getSecondPlace() {
        return secondPlace;
    }

    public void setSecondPlace(String secondPlace) {
        this.secondPlace = secondPlace;
    }

    public String getThirdPlace() {
        return thirdPlace;
    }

    public void setThirdPlace(String thirdPlace) {
        this.thirdPlace = thirdPlace;
    }
}
