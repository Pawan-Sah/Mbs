package com.king.bms.dao;

import com.king.bms.entity.City;
import com.king.bms.entity.Movie;
import com.king.bms.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TheaterDao extends JpaRepository<Theater, Integer> {
    //public Theater findByTheaterName(String name);
    // to find all the movies in specific theater
    // i will add this method same time later

    //public List<Movie> findByMovieTheaterName(String theaterName);

    public List<Theater> findAllByCity(City city);
}
