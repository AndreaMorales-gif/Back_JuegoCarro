package com.co.Juego.JuegoCarro.domain.values.driver;

import com.co.Juego.JuegoCarro.domain.values.car.IdCar;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class IdDriver {
    private final String value;

    public static IdDriver of(String value){
        return  new IdDriver(value);
    }
    public String getValue(){
        return this.value;
    }
}
