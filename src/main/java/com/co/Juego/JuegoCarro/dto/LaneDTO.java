package com.co.Juego.JuegoCarro.dto;



public class LaneDTO {
    private String idLane;

    // @NotBlank
    private String idCar;
    private String idPlayer;
    private String idTrack;
    private String actualPosition;
    private boolean finalDisplacement;

    public LaneDTO(String idLane, String idCar, String idPlayer, String idTrack, String actualPosition, boolean finalDisplacement) {
        this.idLane = idLane;
        this.idCar = idCar;
        this.idPlayer = idPlayer;
        this.idTrack = idTrack;
        this.actualPosition = actualPosition;
        this.finalDisplacement = finalDisplacement;
    }

    public String getIdLane() {
        return idLane;
    }

    public void setIdLane(String idLane) {
        this.idLane = idLane;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public String getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(String idTrack) {
        this.idTrack = idTrack;
    }

    public String getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(String actualPosition) {
        this.actualPosition = actualPosition;
    }

    public boolean isFinalDisplacement() {
        return finalDisplacement;
    }

    public void setFinalDisplacement(boolean finalDisplacement) {
        this.finalDisplacement = finalDisplacement;
    }
}
