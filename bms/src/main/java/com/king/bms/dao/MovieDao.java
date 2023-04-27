package com.king.bms.dao;

import com.king.bms.entity.Movie;
import com.king.bms.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieDao extends JpaRepository<Movie, Integer> {

    // to find movie by movie_name;
    public Movie findMovieByMovieName(String movieName);

    //I want to search based on conditions
    public List<Movie> findByDurationGreaterThanEqual(float duration);

    public List<Movie> findByMovieNameContaining(String movieString);

    public List<Movie> findByMovieNameIgnoreCase(String movien);
}
