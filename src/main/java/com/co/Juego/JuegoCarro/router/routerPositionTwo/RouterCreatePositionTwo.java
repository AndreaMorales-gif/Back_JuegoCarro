package com.co.Juego.JuegoCarro.router.routerPositionTwo;

import com.co.Juego.JuegoCarro.dto.PositionOneDTO;
import com.co.Juego.JuegoCarro.dto.PositionThreeDTO;
import com.co.Juego.JuegoCarro.dto.PositionTwoDTO;
import com.co.Juego.JuegoCarro.useCase.positionOneUseCase.UseCaseCreatePositionOne;
import com.co.Juego.JuegoCarro.useCase.positionThreeUseCase.UseCaseCreatePositionThree;
import com.co.Juego.JuegoCarro.useCase.positionTwoUseCase.UseCaseCreatePositionTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterCreatePositionTwo {
    @Bean
    public RouterFunction<ServerResponse> createPositionTwo(UseCaseCreatePositionTwo useCaseCreatePositionTwo){
        return route(POST("/createPositionTwo").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(PositionTwoDTO.class)
                        .flatMap(positionTwoDTO -> useCaseCreatePositionTwo.createPositionTwo(positionTwoDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }
}
