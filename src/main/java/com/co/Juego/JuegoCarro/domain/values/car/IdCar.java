package com.co.Juego.JuegoCarro.domain.values.car;

import com.co.Juego.JuegoCarro.domain.values.player.IdPlayer;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class IdCar {
    private final String value;

    public static IdCar of(String value){
        return  new IdCar(value);
    }
    public String getValue(){
        return this.value;
    }
}
