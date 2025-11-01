package com.learn.Film_Service.service.service;

import com.learn.Film_Service.model.Actor;
import com.learn.Film_Service.model.dto.ActorDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface ActorService {

    Mono<Actor> create(ActorDto dto);

    Mono<Actor> getActorById(UUID id);

    Flux<Actor> getAllActor();

}
