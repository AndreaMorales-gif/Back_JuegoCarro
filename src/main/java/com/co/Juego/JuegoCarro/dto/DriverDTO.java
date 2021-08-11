package com.co.Juego.JuegoCarro.dto;



public class DriverDTO {

    private String idDriver;

    // @NotBlank
    private String throwDice;
    private String idPlayer;

    public String getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(String idDriver) {
        this.idDriver = idDriver;
    }

    public String getThrowDice() {
        return throwDice;
    }

    public void setThrowDice(String throwDice) {
        this.throwDice = throwDice;
    }

    public String getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
    }
}
