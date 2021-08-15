package com.co.Juego.JuegoCarro.router.routerCar;

import com.co.Juego.JuegoCarro.dto.CarDTO;
import com.co.Juego.JuegoCarro.useCase.carUseCase.UseCaseUpdateCar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterUpdateCar {
    @Bean
    public RouterFunction<ServerResponse> updateCar(UseCaseUpdateCar updateCarUseCase){
        return route(PUT("/updateCar").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(CarDTO.class)
                        .flatMap(carDTO -> updateCarUseCase.updateCar(carDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }
}
