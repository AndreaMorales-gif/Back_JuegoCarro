package com.co.Juego.JuegoCarro.domain.values.player;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
public class IdPlayer {

    private final String value;

    public static IdPlayer of(String value){
        return  new IdPlayer(value);
    }
    public String getValue(){
        return this.value;
    }
}
