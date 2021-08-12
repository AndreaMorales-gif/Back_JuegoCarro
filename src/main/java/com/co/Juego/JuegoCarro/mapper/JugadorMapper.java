package com.co.Juego.JuegoCarro.mapper;

import com.co.Juego.JuegoCarro.domain.model.Player;
import com.co.Juego.JuegoCarro.domain.values.player.IdPlayer;
import com.co.Juego.JuegoCarro.domain.values.player.Name;
import com.co.Juego.JuegoCarro.domain.values.player.QuantityWinner;
import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class JugadorMapper {

    public Function<PlayerDTO, Player> mapperToPlayer(String id){
        return updatePlayer -> new Player(
                IdPlayer.of(id),
                new Name(updatePlayer.getName()),
                new QuantityWinner(updatePlayer.getFirstPlace()),
                new QuantityWinner(updatePlayer.getSecondPlace()),
                new QuantityWinner(updatePlayer.getThirdPlace())
                );

    }

    public Function<Player, PlayerDTO> mapperToPlayerDTO(){
        return player -> new PlayerDTO(
                player.getIdPlayer().getValue(),
                player.getName().getValue(),
                player.getFirstPlace().getValue(),
                player.getSecondPlace().getValue(),
                player.getThirdPlace().getValue()
        );
    }
}
