package com.co.Juego.JuegoCarro.repositories;

import com.co.Juego.JuegoCarro.domain.model.PositionTwo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPositionTwo extends ReactiveMongoRepository<PositionTwo, String> {
}
