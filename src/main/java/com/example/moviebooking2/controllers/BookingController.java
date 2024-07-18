package com.example.moviebooking2.controllers;


import com.example.moviebooking2.dtos.BookShowRequestDto;
import com.example.moviebooking2.dtos.BookShowResponseDto;
import com.example.moviebooking2.dtos.ResponseStatus;
import com.example.moviebooking2.exceptions.SeatNotAvailable;
import com.example.moviebooking2.exceptions.ShowNotFound;
import com.example.moviebooking2.exceptions.UserIsNotValid;
import com.example.moviebooking2.models.Booking;
import com.example.moviebooking2.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

    private BookingService bookingService;
    private static final String USER_NOT_VALID_MESSAGE = "User is Invalid";
    private static final String SHOW_NOT_VALID_MESSAGE = "Show is Invalid";
    private static final String SOMETHING_WENT_WRONG = "Something went wrong";

    @Autowired
    public BookingController(BookingService bookingService) {

        this.bookingService = bookingService;
    }

    public BookShowResponseDto bookShow(BookShowRequestDto bookShowRequestDto){
    BookShowResponseDto responseDto;
        try {
            Booking booking =  bookingService.bookShow(bookShowRequestDto);
            return new BookShowResponseDto(booking.getId(), booking.getAmount(), ResponseStatus.SUCCESS, "SUCCESS");

        } catch (UserIsNotValid e) {
            return new BookShowResponseDto(null,0, ResponseStatus.FAILURE,USER_NOT_VALID_MESSAGE);
        } catch (ShowNotFound e) {
            return new BookShowResponseDto(null, 0, ResponseStatus.FAILURE,SHOW_NOT_VALID_MESSAGE);
        } catch (SeatNotAvailable e) {
            return new BookShowResponseDto(null, 0, ResponseStatus.FAILURE, SOMETHING_WENT_WRONG);
        }


    }

}
