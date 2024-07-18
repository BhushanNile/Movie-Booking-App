package com.example.moviebooking2.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SignUpResponseDto {
    private Long userId;
    private ResponseStatus responseStatus;
}
