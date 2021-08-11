package com.co.Juego.JuegoCarro.repositories;

import com.co.Juego.JuegoCarro.domain.model.Driver;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryDriver extends ReactiveMongoRepository<Driver, String> {
}
