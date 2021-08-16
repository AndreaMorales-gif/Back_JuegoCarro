package com.co.Juego.JuegoCarro.mapper;

import com.co.Juego.JuegoCarro.domain.model.PositionThree;
import com.co.Juego.JuegoCarro.dto.PositionThreeDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PosicionTresMapper {

    public Function<PositionThreeDTO, PositionThree> mapperToPositionThree(String id){
        return updatePositionThree -> {
            PositionThree positionThree = new PositionThree();
            positionThree.setIdPositionThree(id);
            positionThree.setLane(updatePositionThree.getLane());
            positionThree.setNamePositionThree(updatePositionThree.getNamePositionThree());
            positionThree.setCarPositionThree(updatePositionThree.getCarPositionThree());
            positionThree.setKilometerPositionThree(updatePositionThree.getKilometerPositionThree());
            return positionThree;
        };
    }

    public Function<PositionThree, PositionThreeDTO> mapperToPositionThreeDTO(){
        return positionThree -> new PositionThreeDTO(
                positionThree.getIdPositionThree(),
                positionThree.getLane(),
                positionThree.getNamePositionThree(),
                positionThree.getCarPositionThree(),
                positionThree.getKilometerPositionThree()
        );
    }
}
