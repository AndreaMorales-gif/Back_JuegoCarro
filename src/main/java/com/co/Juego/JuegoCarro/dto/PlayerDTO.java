package com.co.Juego.JuegoCarro.dto;



public class PlayerDTO {

    private String idPlayer;

    // @NotBlank
    private String name;

    public String getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
