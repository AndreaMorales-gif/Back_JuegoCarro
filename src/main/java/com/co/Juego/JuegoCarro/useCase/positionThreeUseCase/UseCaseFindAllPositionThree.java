package com.co.Juego.JuegoCarro.useCase.positionThreeUseCase;

import com.co.Juego.JuegoCarro.dto.PositionThreeDTO;
import com.co.Juego.JuegoCarro.mapper.PosicionTresMapper;
import com.co.Juego.JuegoCarro.repositories.RepositoryPositionThree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class UseCaseFindAllPositionThree {
    private final RepositoryPositionThree repositoryPositionThree;
    private final PosicionTresMapper posicionTresMapper;

    @Autowired
    public UseCaseFindAllPositionThree(RepositoryPositionThree repositoryPositionThree, PosicionTresMapper posicionTresMapper) {
        this.repositoryPositionThree = repositoryPositionThree;
        this.posicionTresMapper = posicionTresMapper;
    }

    public Flux<PositionThreeDTO> findByAllPositionThree() {
        return repositoryPositionThree.findAll()
                .map(posicionTresMapper.mapperToPositionThreeDTO());
    }

}
