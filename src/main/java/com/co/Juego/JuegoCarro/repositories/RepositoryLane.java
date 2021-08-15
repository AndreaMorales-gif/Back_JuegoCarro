package com.co.Juego.JuegoCarro.repositories;

import com.co.Juego.JuegoCarro.domain.model.Lane;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface RepositoryLane extends ReactiveMongoRepository<Lane, String> {
    Flux<Lane> findByIdTrack(String idTrack);
}
