package com.co.Juego.JuegoCarro.useCase.positionTwoUseCase;

import com.co.Juego.JuegoCarro.dto.PositionTwoDTO;
import com.co.Juego.JuegoCarro.mapper.PosicionDosMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryPositionTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseCreatePositionTwo {

    private final RepositoryPositionTwo repositoryPositionTwo;
    private final PosicionDosMapper posicionDosMapper;

    @Autowired
    public UseCaseCreatePositionTwo(RepositoryPositionTwo repositoryPositionTwo, PosicionDosMapper posicionDosMapper) {
        this.repositoryPositionTwo = repositoryPositionTwo;
        this.posicionDosMapper = posicionDosMapper;
    }

    public Mono<PositionTwoDTO> createPositionTwo(PositionTwoDTO positionTwoDTO){
        return repositoryPositionTwo
                .save(posicionDosMapper.mapperToPositionTwo(positionTwoDTO.getIdPositionTwo())
                        .apply(positionTwoDTO))
                .map(posicionDosMapper.mapperToPositionTwoDTO());
    }
}
