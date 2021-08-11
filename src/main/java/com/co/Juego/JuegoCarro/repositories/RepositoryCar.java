package com.co.Juego.JuegoCarro.repositories;

import com.co.Juego.JuegoCarro.domain.model.Car;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryCar extends ReactiveMongoRepository<Car, String> {
}
