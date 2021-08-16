package com.co.Juego.JuegoCarro.useCase.positionOneUseCase;

import com.co.Juego.JuegoCarro.dto.PositionOneDTO;
import com.co.Juego.JuegoCarro.mapper.PosicionUnoMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryPositionOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseCreatePositionOne {
    private final RepositoryPositionOne repositoryPositionOne;
    private final PosicionUnoMapper posicionUnoMapper;

    @Autowired

    public UseCaseCreatePositionOne(RepositoryPositionOne repositoryPositionOne, PosicionUnoMapper posicionUnoMapper) {
        this.repositoryPositionOne = repositoryPositionOne;
        this.posicionUnoMapper = posicionUnoMapper;
    }

    public Mono<PositionOneDTO> createPositionOne(PositionOneDTO positionOneDTO){
        return repositoryPositionOne
                .save(posicionUnoMapper.mapperToPositionOne(positionOneDTO.getIdPositionOne())
                        .apply(positionOneDTO))
                             .map(posicionUnoMapper.mapperToPositionOneDTO());
    }
}
