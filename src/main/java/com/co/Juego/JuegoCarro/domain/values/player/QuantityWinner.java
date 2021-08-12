package com.co.Juego.JuegoCarro.domain.values.player;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class QuantityWinner {
    private final Integer value;

    public QuantityWinner incrementValue(Integer value) {
        return new QuantityWinner(value);
    }
}
