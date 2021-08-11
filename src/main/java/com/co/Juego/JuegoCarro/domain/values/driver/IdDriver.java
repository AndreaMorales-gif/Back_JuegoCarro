package com.co.Juego.JuegoCarro.domain.values.driver;

import java.util.UUID;

public class IdDriver {
    private UUID id;

    public IdDriver(UUID id) {
        this.id = id;
    }

    public String getId() {
        return id.toString();
    }
}
