package com.co.Juego.JuegoCarro.useCase.podiumUseCase;

import com.co.Juego.JuegoCarro.dto.PodiumDTO;
import com.co.Juego.JuegoCarro.mapper.PodioMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryPodium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseFindByIdPodium {

    private final RepositoryPodium repositoryPodium;
    private final PodioMapper podioMapper;

    @Autowired
    public UseCaseFindByIdPodium(RepositoryPodium repositoryPodium, PodioMapper podioMapper) {
        this.repositoryPodium = repositoryPodium;
        this.podioMapper = podioMapper;
    }

    public Mono<PodiumDTO> findById(String id){
        return repositoryPodium.findById(id)
                .map(podioMapper.mapperToPodiumDTO());
    }

}
