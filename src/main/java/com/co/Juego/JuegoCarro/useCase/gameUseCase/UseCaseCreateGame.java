package com.co.Juego.JuegoCarro.useCase.gameUseCase;

import com.co.Juego.JuegoCarro.dto.GameDTO;
import com.co.Juego.JuegoCarro.mapper.JuegoMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseCreateGame {

    private final RepositoryGame repositoryGame;
    private final JuegoMapper juegoMapper;

    @Autowired

    public UseCaseCreateGame(RepositoryGame repositoryGame, JuegoMapper juegoMapper) {
        this.repositoryGame = repositoryGame;
        this.juegoMapper = juegoMapper;
    }

    public Mono<GameDTO> createGame(GameDTO gameDTO){
        return repositoryGame.save(juegoMapper.mapperToGame(gameDTO.getIdGame())
                        .apply(gameDTO))
                            .map(juegoMapper.mapperToGameDTO());
    }
}
