package com.co.Juego.JuegoCarro.mapper;

import com.co.Juego.JuegoCarro.domain.model.PositionTwo;
import com.co.Juego.JuegoCarro.dto.PositionTwoDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;


@Component
public class PosicionDosMapper {
    public Function<PositionTwoDTO, PositionTwo> mapperToPositionTwo(String id){
        return updatePositionTwo -> {
            var positionTwo = new PositionTwo();
            positionTwo.setIdPositionTwo(id);
            positionTwo.setLane(updatePositionTwo.getLane());
            positionTwo.setNamePositionTwo(updatePositionTwo.getNamePositionTwo());
            positionTwo.setCarPositionTwo(updatePositionTwo.getCarPositionTwo());
            positionTwo.setKilometerPositionTwo(updatePositionTwo.getKilometerPositionTwo());
            return positionTwo;
        };
    }

    public Function<PositionTwo, PositionTwoDTO> mapperToPositionTwoDTO(){
        return positionTwo -> new PositionTwoDTO(
                positionTwo.getIdPositionTwo(),
                positionTwo.getLane(),
                positionTwo.getNamePositionTwo(),
                positionTwo.getCarPositionTwo(),
                positionTwo.getKilometerPositionTwo()
        );
    }
}
