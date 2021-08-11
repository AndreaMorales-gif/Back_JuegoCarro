package com.co.Juego.JuegoCarro.domain.values.player;

import java.util.UUID;

public class IdPlayer {
    private UUID id;

    public IdPlayer(UUID id) {
        this.id = id;
    }

    public String getId() {
        return id.toString();
    }
}
