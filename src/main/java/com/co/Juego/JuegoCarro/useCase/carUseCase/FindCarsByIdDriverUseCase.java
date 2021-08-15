package com.co.Juego.JuegoCarro.useCase.carUseCase;

import com.co.Juego.JuegoCarro.dto.CarDTO;
import com.co.Juego.JuegoCarro.mapper.CarroMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class FindCarsByIdDriverUseCase {

    private final RepositoryCar repositoryCar;
    private final CarroMapper carroMapper;

    @Autowired
    public FindCarsByIdDriverUseCase(RepositoryCar repositoryCar, CarroMapper carroMapper) {
        this.repositoryCar = repositoryCar;
        this.carroMapper = carroMapper;
    }

    public Flux<CarDTO> findCarsByIdDriver(String id){
        return repositoryCar.findByIdDriver(id)
                .flatMap(
                        car -> Flux.just(carroMapper.mappertoCarDTO().apply(car))
                );
    }
}
