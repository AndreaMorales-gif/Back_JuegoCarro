package com.co.Juego.JuegoCarro.repositories;


import com.co.Juego.JuegoCarro.domain.model.Player;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryPlayer extends ReactiveMongoRepository<Player, String> {
}
