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


    // to find movies by city
    //@Query("select Theaters from Movie where name=:name")
   // public List<Theater> findAllTheaterByMovieName(@Param("name") String name);

    //public List<Theater> findAllTheaterByMovieName(String name);



    //I want to search based on conditions
    public List<Movie> findByDurationGreaterThanEqual(int duration);

    public List<Movie> findByMovieNameContaining(String movieString);

    public List<Movie> findByMovieNameIgnoreCase(String movien);
}
