package com.learn.Film_Service.repository;

import com.learn.Film_Service.model.Actor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ActorRepository extends ReactiveMongoRepository<Actor, UUID> {

}
