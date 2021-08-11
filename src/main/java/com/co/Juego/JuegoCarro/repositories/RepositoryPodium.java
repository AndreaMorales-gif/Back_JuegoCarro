package com.co.Juego.JuegoCarro.repositories;

import com.co.Juego.JuegoCarro.domain.model.Podium;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryPodium extends ReactiveMongoRepository<Podium, String> {
}
