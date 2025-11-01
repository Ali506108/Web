package com.learn.Film_Service.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.LinkedList;
import java.util.UUID;


@Document(collection = "film")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Film {

    @Id

    private UUID id;

    private String title;

    private String description ;

    private Instant releaseDate;

    private Genre[] genre ;

    private LinkedList<UUID> actorIds;

    private Instant createdAt;

    private Instant updatedAt;

}
