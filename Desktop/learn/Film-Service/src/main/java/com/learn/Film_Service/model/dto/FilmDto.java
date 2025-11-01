package com.learn.Film_Service.model.dto;

import com.learn.Film_Service.model.Genre;

import java.time.Instant;
import java.util.LinkedList;
import java.util.UUID;

public record FilmDto(
        String title ,
        String description ,
        Instant releaseDate,
        Genre[] genres ,
        LinkedList<UUID> actorIds
) {
}
