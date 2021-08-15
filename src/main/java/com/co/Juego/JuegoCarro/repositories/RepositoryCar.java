package com.co.Juego.JuegoCarro.repositories;

import com.co.Juego.JuegoCarro.domain.model.Car;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface RepositoryCar extends ReactiveMongoRepository<Car, String> {
    Flux<Car> findByIdDriver(String idDriver);
}
