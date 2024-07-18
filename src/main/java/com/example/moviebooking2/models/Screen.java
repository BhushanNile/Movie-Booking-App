package com.example.moviebooking2.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Screen extends BaseModel{

    private String name;
    /*
    screen  seat
    1       M
    1       1
     */
    @OneToMany
    private List<Seat> seats;

    /*
    screen feature
    1       M
    M       1
     */
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection //this will create separate mapping table
    private List<Feature> features;
}
