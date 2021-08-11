package com.co.Juego.JuegoCarro.domain.values.track;

import java.util.UUID;

public class IdTrack {
    private UUID id;

    public IdTrack(UUID id) {
        this.id = id;
    }

    public String getId() {
        return id.toString();
    }
}
