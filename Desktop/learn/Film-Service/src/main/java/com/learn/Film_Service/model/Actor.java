package com.learn.Film_Service.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedList;
import java.util.UUID;


@Document
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Actor {

    @Id
    private UUID id;

    private String FullName;

    private int age;

    private Gender gender;

    private LinkedList<UUID> filmIds;

}
