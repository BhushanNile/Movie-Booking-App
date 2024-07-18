package com.example.moviebooking2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Region extends BaseModel{

    private String name;

    /*
    Region Theatre
    1       M
    1        1
     */
    @OneToMany
    private List<Theatre> theatreList;

}
