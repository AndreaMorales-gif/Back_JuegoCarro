package com.co.Juego.JuegoCarro.domain.values.podium;

import com.co.Juego.JuegoCarro.domain.values.lane.IdLane;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class IdPodium {
    private final String value;

    public static IdPodium of(String value){
        return  new IdPodium(value);
    }
    public String getValue(){
        return this.value;
    }
}
