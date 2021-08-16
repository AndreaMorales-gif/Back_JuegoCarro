package com.co.Juego.JuegoCarro.mapper;

import com.co.Juego.JuegoCarro.domain.model.Podium;
import com.co.Juego.JuegoCarro.dto.PodiumDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PodioMapper {

    public Function<PodiumDTO, Podium> mapperToPodium(String id){
        return updatePodium -> {
            Podium podium = new Podium();
            podium.setIdPodium(id);
            podium.setFirstPlace(updatePodium.getFirstPlace());
            podium.setSecondPlace(updatePodium.getSecondPlace());
            podium.setThirdPlace(updatePodium.getThirdPlace());
            return podium;
        };
    }

    public Function<Podium,PodiumDTO> mapperToPodiumDTO(){
        return podium -> new PodiumDTO(
                podium.getIdPodium(),
                podium.getFirstPlace(),
                podium.getSecondPlace(),
                podium.getThirdPlace()
        );
    }
}
