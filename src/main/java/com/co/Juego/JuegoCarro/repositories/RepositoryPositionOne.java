package com.co.Juego.JuegoCarro.repositories;


import com.co.Juego.JuegoCarro.domain.model.PositionOne;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryPositionOne extends ReactiveMongoRepository<PositionOne, String> {
}
