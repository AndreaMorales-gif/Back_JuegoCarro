package com.co.Juego.JuegoCarro.mapper;

import com.co.Juego.JuegoCarro.domain.model.Game;
import com.co.Juego.JuegoCarro.dto.GameDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class JuegoMapper {

    public Function<GameDTO, Game> mapperToGame(String id){
        return updateGame -> {
            Game game = new Game();
            game.setIdGame(id);
            return game;
        };
    }

    public Function<Game,GameDTO> mapperToGameDTO(){
        return game -> new GameDTO(
                game.getIdGame()
        );
    }
}
