package com.co.Juego.JuegoCarro.useCase.driverUseCase;

import com.co.Juego.JuegoCarro.dto.DriverDTO;
import com.co.Juego.JuegoCarro.mapper.ConductorMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryCar;
import com.co.Juego.JuegoCarro.repositories.RepositoryDriver;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseCreateDriver {

    private final RepositoryDriver repositoryDriver;
    private final ConductorMapper conductorMapper;

    public UseCaseCreateDriver(RepositoryDriver repositoryDriver, ConductorMapper conductorMapper) {
        this.repositoryDriver = repositoryDriver;
        this.conductorMapper = conductorMapper;
    }

    public Mono<DriverDTO> createDriver(DriverDTO driverDTO) {
        return repositoryDriver
                .save(conductorMapper.mapperToDriver(driverDTO.getIdDriver())
                        .apply(driverDTO))
                            .map(conductorMapper.mapperToDriverDTO());
    }
}
