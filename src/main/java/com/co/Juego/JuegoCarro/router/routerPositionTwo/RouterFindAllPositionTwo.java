package com.co.Juego.JuegoCarro.router.routerPositionTwo;

import com.co.Juego.JuegoCarro.dto.PositionThreeDTO;
import com.co.Juego.JuegoCarro.dto.PositionTwoDTO;
import com.co.Juego.JuegoCarro.useCase.positionThreeUseCase.UseCaseFindAllPositionThree;
import com.co.Juego.JuegoCarro.useCase.positionTwoUseCase.UseCaseFindAllPositionTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterFindAllPositionTwo {
    @Bean
    public RouterFunction<ServerResponse> findByAllPositionTwo(UseCaseFindAllPositionTwo useCaseFindAllPositionTwo){
        return route(
                GET("/findAllPositionTwo").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(useCaseFindAllPositionTwo.findByAllPositionTwo(), PositionTwoDTO.class))
        );
    }
}
