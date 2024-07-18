package com.example.moviebooking2.repositories;


import com.example.moviebooking2.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRespository extends JpaRepository<Booking, Long> {

}
