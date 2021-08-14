package com.co.Juego.JuegoCarro.domain.values.game;

import com.co.Juego.JuegoCarro.domain.values.driver.IdDriver;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class IdGame {
    private final String value;

    public static IdGame of(String value){
        return  new IdGame(value);
    }
    public String getValue(){
        return this.value;
    }
}
