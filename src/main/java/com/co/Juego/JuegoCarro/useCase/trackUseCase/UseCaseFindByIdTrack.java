package com.co.Juego.JuegoCarro.useCase.trackUseCase;

import com.co.Juego.JuegoCarro.dto.TrackDTO;
import com.co.Juego.JuegoCarro.mapper.PistaMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryTrack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseFindByIdTrack {

    private final RepositoryTrack repositoryTrack;
    private final PistaMapper pistaMapper;

    @Autowired

    public UseCaseFindByIdTrack(RepositoryTrack repositoryTrack, PistaMapper pistaMapper) {
        this.repositoryTrack = repositoryTrack;
        this.pistaMapper = pistaMapper;
    }

    public Mono<TrackDTO> findById(String id){
        return repositoryTrack.findById(id)
                .map(pistaMapper.mapperToTrackDTO());
    }
}
