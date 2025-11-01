package com.learn.Film_Service.service.impl;

import com.learn.Film_Service.mapper.FilmMapper;
import com.learn.Film_Service.model.Film;
import com.learn.Film_Service.model.dto.FilmDto;
import com.learn.Film_Service.repository.FilmRepository;
import com.learn.Film_Service.service.service.FilmService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {

    private final FilmRepository repository;

    private final FilmMapper mapper;

    @Override
    public Mono<Film> createFilm(FilmDto dto) {
        return Mono.just(dto)
                .map(mapper::toEntity)
                .flatMap(repository::save)
                .doOnSubscribe(sub -> log.debug("Start to saving film...."))
                .doOnSuccess(suc -> log.info("Film saved successfully {} " , suc))
                .doOnError(err -> log.error("Error while saving actor : {} " , err.getMessage()))
                .onErrorResume(err -> {
                    log.warn("Fallback: returning empty Actor because of error");
                    return Mono.empty();
                });
    }

    @Override
    public Mono<Film> updateFilm(FilmDto dto, UUID id) {
        return null;
    }

    @Override
    public Flux<Film> getAllFilm() {
        return repository.findAll()
                .doOnNext(nex -> log.info("we find film {} " , nex))
                .doOnError(err -> log.error("we don't find film"));
    }

    @Override
    public Flux<Film> findFilmWithActorId(UUID actorId) {
        return repository.findAll()
                .filter(film -> film.getActorIds().contains(actorId));
    }


}