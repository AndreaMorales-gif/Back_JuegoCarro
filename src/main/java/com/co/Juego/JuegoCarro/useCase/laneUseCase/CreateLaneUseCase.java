package com.co.Juego.JuegoCarro.useCase.laneUseCase;

import com.co.Juego.JuegoCarro.dto.LaneDTO;
import com.co.Juego.JuegoCarro.mapper.CarrilMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryLane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class CreateLaneUseCase {
    private final RepositoryLane repositoryLane;
    private final CarrilMapper carrilMapper;

    @Autowired
    public CreateLaneUseCase(RepositoryLane repositoryLane, CarrilMapper carrilMapper) {
        this.repositoryLane = repositoryLane;
        this.carrilMapper = carrilMapper;
    }

    public Mono<LaneDTO> createLane(LaneDTO laneDTO){
        return repositoryLane.save(carrilMapper.mapperToLane(laneDTO.getIdLane())
                        .apply(laneDTO))
                            .map(carrilMapper.mapperToLaneDTO());
    }
}