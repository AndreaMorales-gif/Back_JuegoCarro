package com.co.Juego.JuegoCarro.useCase.carUseCase;

import com.co.Juego.JuegoCarro.dto.CarDTO;
import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import com.co.Juego.JuegoCarro.mapper.CarroMapper;
import com.co.Juego.JuegoCarro.mapper.JugadorMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryCar;
import com.co.Juego.JuegoCarro.repositories.RepositoryPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class FindByIdCarUseCase {

    private final RepositoryCar repositoryCar;
    private final CarroMapper carroMapper;

    @Autowired
    public FindByIdCarUseCase(RepositoryCar repositoryCar, CarroMapper carroMapper) {
        this.repositoryCar = repositoryCar;
        this.carroMapper = carroMapper;
    }

    public Mono<CarDTO> findByIdCar(String id) {
        return repositoryCar.findById(id)
                .map(carroMapper.mappertoCarDTO());
    }
}
