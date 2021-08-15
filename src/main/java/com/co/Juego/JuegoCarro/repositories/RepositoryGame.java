package com.co.Juego.JuegoCarro.repositories;

import com.co.Juego.JuegoCarro.domain.model.Game;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryGame extends ReactiveMongoRepository<Game, String> {
}
