package com.example.moviebooking2.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    @OneToMany //if cancellation need to be done then its many to many
    private List<ShowSeat> showSeatsList;
    private int amount;
    @OneToMany
    private List<Payment> payments;
    @ManyToOne
    private User user;

}
