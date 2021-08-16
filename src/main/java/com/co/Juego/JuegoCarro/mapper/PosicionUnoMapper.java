package com.co.Juego.JuegoCarro.mapper;

import com.co.Juego.JuegoCarro.domain.model.PositionOne;
import com.co.Juego.JuegoCarro.dto.PositionOneDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PosicionUnoMapper {

    public Function<PositionOneDTO, PositionOne> mapperToPositionOne(String id){
        return updatePositionOne -> {
            var positionOne = new PositionOne();
            positionOne.setIdPositionOne(id);
            positionOne.setLane(updatePositionOne.getLane());
            positionOne.setNamePositionOne(updatePositionOne.getNamePositionOne());
            positionOne.setCarPositionOne(updatePositionOne.getCarPositionOne());
            positionOne.setKilometerPositionOne(updatePositionOne.getKilometerPositionOne());
            return positionOne;
        };
    }

    public Function<PositionOne, PositionOneDTO> mapperToPositionOneDTO(){
        return positionOne -> new PositionOneDTO(
                positionOne.getIdPositionOne(),
                positionOne.getLane(),
                positionOne.getNamePositionOne(),
                positionOne.getCarPositionOne(),
                positionOne.getKilometerPositionOne()
        );
    }
}
