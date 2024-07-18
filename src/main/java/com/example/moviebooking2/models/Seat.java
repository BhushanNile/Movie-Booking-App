package com.example.moviebooking2.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "seats")
@Getter
@Setter
public class Seat extends BaseModel{

    private int number;
    private String seatType;
    private int rowNumber;
    private int colNumber;

}
