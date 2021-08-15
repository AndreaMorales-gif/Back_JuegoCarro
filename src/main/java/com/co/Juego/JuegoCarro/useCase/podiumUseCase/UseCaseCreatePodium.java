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
public class UseCaseCreatePodium {

    private final RepositoryPodium repositoryPodium;
    private final PodioMapper podioMapper;

    @Autowired
    public UseCaseCreatePodium(RepositoryPodium repositoryPodium, PodioMapper podioMapper) {
        this.repositoryPodium = repositoryPodium;
        this.podioMapper = podioMapper;
    }

    public Mono<PodiumDTO> createPodium(PodiumDTO podiumDTO){
        return repositoryPodium.save(podioMapper.mapperToPodium(podiumDTO.getIdPodium())
                        .apply(podiumDTO))
                            .map(podioMapper.mapperToPodiumDTO());
    }
}
