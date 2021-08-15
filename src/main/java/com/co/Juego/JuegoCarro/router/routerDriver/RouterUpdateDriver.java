package com.co.Juego.JuegoCarro.router.routerDriver;

import com.co.Juego.JuegoCarro.dto.DriverDTO;
import com.co.Juego.JuegoCarro.useCase.driverUseCase.UseCaseUpdateDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterUpdateDriver {
    @Bean
    public RouterFunction<ServerResponse> updateDriver(UseCaseUpdateDriver updateDriver){
        return route(PUT("/updateDriver").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(DriverDTO.class)
                        .flatMap(driverDTO -> updateDriver.updateDriver(driverDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }
}
