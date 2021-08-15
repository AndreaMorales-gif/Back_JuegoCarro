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
public class UseCaseFindByIdLane {
    private final RepositoryLane repositoryLane;
    private final CarrilMapper carrilMapper;

    @Autowired
    public UseCaseFindByIdLane(RepositoryLane repositoryLane, CarrilMapper carrilMapper) {
        this.repositoryLane = repositoryLane;
        this.carrilMapper = carrilMapper;
    }

    public Mono<LaneDTO> findById(String id){
        return repositoryLane.findById(id)
                .map(carrilMapper.mapperToLaneDTO());

    }
}
