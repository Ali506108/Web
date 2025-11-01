package com.learn.Film_Service.mapper;

import com.learn.Film_Service.model.Film;
import com.learn.Film_Service.model.dto.FilmDto;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class FilmMapper {


    public Film toEntity(FilmDto dto) {
        return Film.builder()
                .id(UUID.randomUUID())
                .title(dto.title())
                .description(dto.description())
                .releaseDate(dto.releaseDate())
                .genre(dto.genres())
                .actorIds(dto.actorIds())
                .build();
    }



}
