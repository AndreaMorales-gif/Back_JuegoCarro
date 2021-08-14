package com.co.Juego.JuegoCarro.useCase.playerUseCase;

import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import com.co.Juego.JuegoCarro.mapper.JugadorMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseUpdatePlayer {
    private final RepositoryPlayer repositoryPlayer;
    private final JugadorMapper jugadorMapper;

    @Autowired
    public UseCaseUpdatePlayer(RepositoryPlayer repositoryPlayer, JugadorMapper jugadorMapper) {
        this.repositoryPlayer = repositoryPlayer;
        this.jugadorMapper = jugadorMapper;
    }

    public Mono<PlayerDTO> updatePlayer(PlayerDTO playerDTO){
        return  repositoryPlayer
                .save(jugadorMapper.mapperToPlayer(playerDTO.getIdPlayer())
                        .apply(playerDTO))
                .map(jugadorMapper.mapperToPlayerDTO());
    }

}
