package com.co.Juego.JuegoCarro.useCase.laneUseCase;

import com.co.Juego.JuegoCarro.dto.LaneDTO;
import com.co.Juego.JuegoCarro.mapper.CarrilMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryLane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class UseCaseFindLaneByIdTrack {
    private final RepositoryLane repositoryLane;
    private final CarrilMapper carrilMapper;

    @Autowired
    public UseCaseFindLaneByIdTrack(RepositoryLane repositoryLane, CarrilMapper carrilMapper) {
        this.repositoryLane = repositoryLane;
        this.carrilMapper = carrilMapper;
    }

    public Flux<LaneDTO> findLaneByTrackId(String id){
        return repositoryLane.findByIdTrack(id)
                .flatMap(
                        rail -> Flux.just(carrilMapper.mapperToLaneDTO().apply(rail))
                );
    }
}
