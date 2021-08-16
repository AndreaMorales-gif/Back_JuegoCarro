package com.co.Juego.JuegoCarro.useCase.positionTwoUseCase;

import com.co.Juego.JuegoCarro.dto.PositionThreeDTO;
import com.co.Juego.JuegoCarro.dto.PositionTwoDTO;
import com.co.Juego.JuegoCarro.mapper.PosicionDosMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryPositionTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class UseCaseFindAllPositionTwo {

    private final RepositoryPositionTwo repositoryPositionTwo;
    private final PosicionDosMapper posicionDosMapper;

    @Autowired
    public UseCaseFindAllPositionTwo(RepositoryPositionTwo repositoryPositionTwo, PosicionDosMapper posicionDosMapper) {
        this.repositoryPositionTwo = repositoryPositionTwo;
        this.posicionDosMapper = posicionDosMapper;
    }

    public Flux<PositionTwoDTO> findByAllPositionTwo() {
        return repositoryPositionTwo.findAll()
                .map(posicionDosMapper.mapperToPositionTwoDTO());
    }
}
