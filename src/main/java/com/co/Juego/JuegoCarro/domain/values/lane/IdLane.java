package com.co.Juego.JuegoCarro.domain.values.lane;

import com.co.Juego.JuegoCarro.domain.values.game.IdGame;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class IdLane {
    private final String value;

    public static IdLane of(String value){
        return  new IdLane(value);
    }
    public String getValue(){
        return this.value;
    }
}
