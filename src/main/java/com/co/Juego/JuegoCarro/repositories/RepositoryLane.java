package com.co.Juego.JuegoCarro.repositories;

import com.co.Juego.JuegoCarro.domain.model.Lane;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryLane extends ReactiveMongoRepository<Lane, String> {
}
