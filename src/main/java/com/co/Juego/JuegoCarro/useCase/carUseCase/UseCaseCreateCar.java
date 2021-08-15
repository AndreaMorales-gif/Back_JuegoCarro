package com.co.Juego.JuegoCarro.useCase.carUseCase;

import com.co.Juego.JuegoCarro.dto.CarDTO;
import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import com.co.Juego.JuegoCarro.mapper.CarroMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.config.RepositoryConfigurationExtensionSupport;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseCreateCar {

    private final RepositoryCar repositoryCar;
    private final CarroMapper carroMapper;
    @Autowired
    public UseCaseCreateCar(RepositoryCar repositoryCar, CarroMapper carroMapper) {
        this.repositoryCar = repositoryCar;
        this.carroMapper = carroMapper;
    }

    public Mono<CarDTO> createCar(CarDTO carDTO) {
        return repositoryCar
                .save(carroMapper.mapperToCar(carDTO.getIdCar())
                        .apply(carDTO))
                            .map(carroMapper.mappertoCarDTO());
    }
}
