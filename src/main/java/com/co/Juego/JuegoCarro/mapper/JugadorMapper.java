package com.co.Juego.JuegoCarro.mapper;

import com.co.Juego.JuegoCarro.domain.model.Player;
import com.co.Juego.JuegoCarro.domain.values.car.IdCar;
import com.co.Juego.JuegoCarro.domain.values.game.IdGame;
import com.co.Juego.JuegoCarro.domain.values.player.IdPlayer;
import com.co.Juego.JuegoCarro.domain.values.player.Name;
import com.co.Juego.JuegoCarro.domain.values.player.QuantityWinner;
import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class JugadorMapper {

    public Function<PlayerDTO, Player> mapperToPlayer(String id){
        return updatePlayer -> {
            var player = new Player();
            player.setIdPlayer(id);
            player.setName(updatePlayer.getName());
            player.setFirstPlace(updatePlayer.getFirstPlace());
            player.setSecondPlace(updatePlayer.getSecondPlace());
            player.setThirdPlace(updatePlayer.getThirdPlace());
            player.setIdGame(updatePlayer.getIdGame());
            player.setIdCar(updatePlayer.getIdCar());
            return player;
        };
    }

    public Function<Player, PlayerDTO> mapperToPlayerDTO(){
        return player -> new PlayerDTO(
                player.getIdPlayer(),
                player.getName(),
                player.getFirstPlace(),
                player.getSecondPlace(),
                player.getThirdPlace(),
                player.getIdGame(),
                player.getIdCar()
        );
    }
}
