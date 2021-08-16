package com.co.Juego.JuegoCarro.mapper;

import com.co.Juego.JuegoCarro.domain.model.Player;
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
            player.setCar(updatePlayer.getCar());
            player.setKilometer(updatePlayer.getKilometer());
            return player;
        };
    }

    public Function<Player, PlayerDTO> mapperToPlayerDTO(){
        return player -> new PlayerDTO(
                player.getIdPlayer(),
                player.getName(),
                player.getCar(),
                player.getKilometer()
        );
    }
}
