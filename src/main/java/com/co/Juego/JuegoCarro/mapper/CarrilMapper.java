package com.co.Juego.JuegoCarro.mapper;

import com.co.Juego.JuegoCarro.domain.model.Lane;
import com.co.Juego.JuegoCarro.dto.LaneDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CarrilMapper {
    public Function<LaneDTO, Lane> mapperToLane(String id){
        return updateLane -> {
            Lane lane = new Lane();
            lane.setIdLane(id);
            lane.setIdCar(updateLane.getIdCar());
            lane.setIdDriver(updateLane.getIdDriver());
            lane.setIdTrack(updateLane.getIdTrack());
            lane.setIdGame(updateLane.getIdGame());
            return  lane;
        };
    }

    public Function<Lane,LaneDTO> mapperToLaneDTO(){
        return lane -> new LaneDTO(
                lane.getIdLane(),
                lane.getIdCar(),
                lane.getIdDriver(),
                lane.getIdTrack(),
                lane.getIdGame()
        );

    }
}
