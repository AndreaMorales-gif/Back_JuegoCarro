package com.co.Juego.JuegoCarro.router.routerDriver;

import com.co.Juego.JuegoCarro.dto.DriverDTO;
import com.co.Juego.JuegoCarro.useCase.driverUseCase.UseCaseFindByIdDriver;
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
public class RouterFindByIdDriver {
    @Bean
    public RouterFunction<ServerResponse> findByIdDriver(UseCaseFindByIdDriver useCaseFindByIdDriver){
        return route(
                GET("/getIdDriver/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(useCaseFindByIdDriver.findByIdDriver(request.pathVariable("id")), DriverDTO.class))
        );
    }
}
