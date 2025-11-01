package com.learn.Film_Service.service.service;

import com.learn.Film_Service.model.Film;
import com.learn.Film_Service.model.dto.FilmDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface FilmService {

    Mono<Film> createFilm(FilmDto dto);

    Mono<Film> updateFilm(FilmDto dto , UUID id);

    Flux<Film> getAllFilm();

    Flux<Film> findFilmWithActorId(UUID actorId);


}
