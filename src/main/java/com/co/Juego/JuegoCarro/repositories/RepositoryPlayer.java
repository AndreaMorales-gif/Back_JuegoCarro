package com.co.Juego.JuegoCarro.repositories;


import com.co.Juego.JuegoCarro.domain.model.Player;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface RepositoryPlayer extends ReactiveMongoRepository<Player, String> {
    Flux<Player> findByIdGame(String idGame);
}
