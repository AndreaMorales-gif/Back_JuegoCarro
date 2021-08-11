package com.co.Juego.JuegoCarro.domain.values.lane;

import java.util.UUID;

public class IdLane {
    private UUID id;

    public IdLane(UUID id) {
        this.id = id;
    }

    public String getId() {
        return id.toString();
    }
}
