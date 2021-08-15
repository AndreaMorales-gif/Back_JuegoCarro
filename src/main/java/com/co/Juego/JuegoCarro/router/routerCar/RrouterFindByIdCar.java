package com.co.Juego.JuegoCarro.router.routerCar;

import com.co.Juego.JuegoCarro.dto.CarDTO;
import com.co.Juego.JuegoCarro.useCase.carUseCase.UseCaseFindByIdCar;
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
public class RrouterFindByIdCar {
    @Bean
    public RouterFunction<ServerResponse> findByIdCar(UseCaseFindByIdCar findByIdCarUseCase){
        return route(GET("/getIdCar/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findByIdCarUseCase.findByIdCar(request.pathVariable("id")), CarDTO.class))
        );
    }
}
