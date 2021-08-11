package com.co.Juego.JuegoCarro.repositories;

import com.co.Juego.JuegoCarro.domain.model.Track;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryTrack extends ReactiveMongoRepository<Track, String> {
}
