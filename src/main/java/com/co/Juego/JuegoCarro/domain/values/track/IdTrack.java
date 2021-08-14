package com.co.Juego.JuegoCarro.domain.values.track;

import com.co.Juego.JuegoCarro.domain.values.podium.IdPodium;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class IdTrack {
    private final String value;

    public static IdTrack of(String value){
        return  new IdTrack(value);
    }
    public String getValue(){
        return this.value;
    }
}
