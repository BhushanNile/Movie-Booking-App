package com.example.moviebooking2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{

    private String name;
//    private int rating;
//    private String actor;
    @Enumerated(EnumType.ORDINAL)
    private Language language;
}
