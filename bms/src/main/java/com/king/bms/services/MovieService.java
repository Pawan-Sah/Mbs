package com.king.bms.services;

import com.king.bms.entity.Movie;
import com.king.bms.exceptions.MovieDetailsNotFoundException;

public interface MovieService {
    public Movie acceptMovieDetails(Movie movie);

    public Movie getMovieDeatils(int movieId) throws MovieDetailsNotFoundException;
}
