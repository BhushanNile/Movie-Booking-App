package com.example.moviebooking2.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookShowRequestDto {

    private Long userId;
    private List<Long> showSeatIds;
    private Long showId;
}
