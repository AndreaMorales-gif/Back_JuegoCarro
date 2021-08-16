package com.co.Juego.JuegoCarro.useCase.positionOneUseCase;

import com.co.Juego.JuegoCarro.dto.PositionOneDTO;
import com.co.Juego.JuegoCarro.dto.PositionThreeDTO;
import com.co.Juego.JuegoCarro.mapper.PosicionUnoMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryPositionOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class UseCaseFindAllPositionOne {
    private final RepositoryPositionOne repositoryPositionOne;
    private final PosicionUnoMapper posicionUnoMapper;

    @Autowired

    public UseCaseFindAllPositionOne(RepositoryPositionOne repositoryPositionOne, PosicionUnoMapper posicionUnoMapper) {
        this.repositoryPositionOne = repositoryPositionOne;
        this.posicionUnoMapper = posicionUnoMapper;
    }

    public Flux<PositionOneDTO> findByAllPositionOne() {
        return repositoryPositionOne.findAll()
                .map(posicionUnoMapper.mapperToPositionOneDTO());
    }
}
