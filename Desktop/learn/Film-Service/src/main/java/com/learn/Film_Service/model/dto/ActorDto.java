package com.learn.Film_Service.model.dto;

import com.learn.Film_Service.model.Gender;

import java.util.LinkedList;
import java.util.UUID;

public record ActorDto(
        String fullName,
        int age ,
        Gender gender ,
        LinkedList<UUID> filmIds
) {
}
