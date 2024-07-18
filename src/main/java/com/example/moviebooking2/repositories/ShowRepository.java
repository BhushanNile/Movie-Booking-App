package com.example.moviebooking2.repositories;


import com.example.moviebooking2.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long>{
}
