package com.co.Juego.JuegoCarro.useCase.playerUseCase;

import com.co.Juego.JuegoCarro.domain.model.Player;
import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import com.co.Juego.JuegoCarro.mapper.JugadorMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryPlayer;
import com.mongodb.MongoNodeIsRecoveringException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseCreatePlayer {

    private final RepositoryPlayer repositoryPlayer;
    private  final JugadorMapper jugadorMapper;

    @Autowired
    public UseCaseCreatePlayer(RepositoryPlayer repositoryPlayer, JugadorMapper jugadorMapper) {
        this.repositoryPlayer = repositoryPlayer;
        this.jugadorMapper = jugadorMapper;
    }


    public Mono<PlayerDTO> apply(PlayerDTO playerDTO){
        return repositoryPlayer
                .save(jugadorMapper.mapperToPlayer(playerDTO.getIdPlayer())
                    .apply(playerDTO))
                        .thenReturn(playerDTO);

    }

}
