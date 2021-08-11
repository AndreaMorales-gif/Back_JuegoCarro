package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.driver.IdDriver;
import com.co.Juego.JuegoCarro.domain.values.driver.ThrowDice;
import com.co.Juego.JuegoCarro.domain.values.player.IdPlayer;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Driver {

    @Id
    private IdDriver idDriver;

    private ThrowDice throwDice;
    private IdPlayer idPlayer;

    public IdDriver getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(IdDriver idDriver) {
        this.idDriver = idDriver;
    }

    public ThrowDice getThrowDice() {
        return throwDice;
    }

    public void setThrowDice(ThrowDice throwDice) {
        this.throwDice = throwDice;
    }

    public IdPlayer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(IdPlayer idPlayer) {
        this.idPlayer = idPlayer;
    }
}
