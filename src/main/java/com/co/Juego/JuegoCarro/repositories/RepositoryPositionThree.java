package com.co.Juego.JuegoCarro.repositories;

import com.co.Juego.JuegoCarro.domain.model.PositionThree;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryPositionThree extends ReactiveMongoRepository<PositionThree, String> {
}
