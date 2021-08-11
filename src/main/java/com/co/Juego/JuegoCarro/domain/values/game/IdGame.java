package com.co.Juego.JuegoCarro.domain.values.game;

import java.util.UUID;

public class IdGame {
    private UUID id;

    public IdGame(UUID id) {
        this.id = id;
    }

    public String getId() {
        return id.toString();
    }
}
