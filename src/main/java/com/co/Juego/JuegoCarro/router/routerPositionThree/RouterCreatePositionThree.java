package com.co.Juego.JuegoCarro.router.routerPositionThree;

import com.co.Juego.JuegoCarro.dto.PositionThreeDTO;
import com.co.Juego.JuegoCarro.useCase.positionThreeUseCase.UseCaseCreatePositionThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterCreatePositionThree {
    @Bean
    public RouterFunction<ServerResponse> createPositionThree(UseCaseCreatePositionThree useCaseCreatePositionThree){
        return route(POST("/createPositionThree").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(PositionThreeDTO.class)
                        .flatMap(positionThreeDTO -> useCaseCreatePositionThree.createPositionThree(positionThreeDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }
}
