package com.learn.Film_Service.service.impl;

import com.learn.Film_Service.mapper.ActorMapper;
import com.learn.Film_Service.model.Actor;
import com.learn.Film_Service.model.dto.ActorDto;
import com.learn.Film_Service.repository.ActorRepository;
import com.learn.Film_Service.repository.FilmRepository;
import com.learn.Film_Service.service.service.ActorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class ActorServiceImpl implements ActorService {

    private final ActorRepository repository;
    private final FilmRepository filmRepository;
    private final ActorMapper mapper;


    @Override
    public Mono<Actor> create(ActorDto dto) {
        return Mono.just(dto)
                .map(mapper::toEntity)
                .flatMap(repository::save)
                .doOnSubscribe(sub -> log.debug("Start to saving actor...."))
                .doOnSuccess(suc -> log.info("we saved"))
                .doOnError(err -> log.error("we have error , {} " , err.getMessage()))
                .onErrorResume(err -> {
                    log.warn("Fallback: returning empty Actor because of error");
                    return Mono.empty();
                });
    }

    @Override
    public Mono<Actor> getActorById(UUID id) {
        return repository.findById(id)
                .doOnSubscribe(sub ->
                        log.debug("we find actor {} " , sub))
                .doOnSuccess(suc ->
                        log.info("we find actor {} " , suc))
                .doOnError(err ->
                        log.error("we have error , {} " , err.getMessage())
                );
    }

    @Override
    public Flux<Actor> getAllActor() {
        return repository.findAll()
                .doOnNext(nex ->
                        log.info("we find actor {} " , nex))
                .doOnError(err ->
                        log.error("we don't find actor"));
    }


}
