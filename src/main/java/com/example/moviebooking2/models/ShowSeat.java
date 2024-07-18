package com.example.moviebooking2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel{

    /*
    ShowSeat    show
    1           1
    M           1

    showseat table
    id/seat/status
    1/A1/booked
    1/A2/booked
    2/A1/booked

     */
    @ManyToOne
    private Show show;

    /*
    ShowSeat    seat
    1           1
    M           1

     */
    @ManyToOne
    private Seat seat;

    /*
    ShowSeat    status
    1           1
    M           1
     */

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;

    private Date lockedAt;

}
