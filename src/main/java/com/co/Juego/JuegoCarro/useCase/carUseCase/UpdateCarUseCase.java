package com.co.Juego.JuegoCarro.useCase.carUseCase;

import com.co.Juego.JuegoCarro.dto.CarDTO;
import com.co.Juego.JuegoCarro.mapper.CarroMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UpdateCarUseCase {

    private final RepositoryCar repositoryCar;
    private final CarroMapper carroMapper;

    @Autowired
    public UpdateCarUseCase(RepositoryCar repositoryCar, CarroMapper carroMapper) {
        this.repositoryCar = repositoryCar;
        this.carroMapper = carroMapper;
    }

    public Mono<CarDTO> updateCar(CarDTO carDTO) {
        return repositoryCar
                .save(carroMapper.mapperToCar(carDTO.getIdCar())
                        .apply(carDTO))
                .map(carroMapper.mappertoCarDTO());
    }
}
