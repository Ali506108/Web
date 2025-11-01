package com.learn.Film_Service.mapper;

import com.learn.Film_Service.model.Actor;
import com.learn.Film_Service.model.dto.ActorDto;
import org.springframework.stereotype.Component;

@Component
public class ActorMapper {


    public Actor toEntity(ActorDto dto) {
        return Actor.builder()
                .FullName(dto.fullName())
                .age(dto.age())
                .gender(dto.gender())
                .filmIds(dto.filmIds())
                .build();
    }
}
