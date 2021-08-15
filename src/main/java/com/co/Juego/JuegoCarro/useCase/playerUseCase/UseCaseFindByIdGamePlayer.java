package com.co.Juego.JuegoCarro.useCase.playerUseCase;

import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import com.co.Juego.JuegoCarro.mapper.JugadorMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class UseCaseFindByIdGamePlayer {

    private final RepositoryPlayer repositoryPlayer;
    private  final JugadorMapper jugadorMapper;

    @Autowired

    public UseCaseFindByIdGamePlayer(RepositoryPlayer repositoryPlayer, JugadorMapper jugadorMapper) {
        this.repositoryPlayer = repositoryPlayer;
        this.jugadorMapper = jugadorMapper;
    }

    public Flux<PlayerDTO> findPlayersByGameId(String id){
        return repositoryPlayer.findByIdGame(id)
                .flatMap(
                        player -> Flux.just(jugadorMapper.mapperToPlayerDTO().apply(player))
                );
    }
}
