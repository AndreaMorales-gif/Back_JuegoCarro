package com.co.Juego.JuegoCarro.useCase.driverUseCase;

import com.co.Juego.JuegoCarro.dto.DriverDTO;
import com.co.Juego.JuegoCarro.mapper.ConductorMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseFindByIdDriver {

    private final RepositoryDriver repositoryDriver;
    private final ConductorMapper conductorMapper;

    @Autowired
    public UseCaseFindByIdDriver(RepositoryDriver repositoryDriver, ConductorMapper conductorMapper) {
        this.repositoryDriver = repositoryDriver;
        this.conductorMapper = conductorMapper;
    }

    public Mono<DriverDTO> findByIdDriver(String id) {
        return repositoryDriver.findById(id)
                .map(conductorMapper.mapperToDriverDTO());
    }
}



