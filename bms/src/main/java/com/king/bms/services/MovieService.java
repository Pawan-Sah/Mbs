package com.king.bms.services;

import com.king.bms.entity.Movie;
import com.king.bms.exceptions.MovieDetailsNotFoundException;

import java.util.List;

public interface MovieService {
    /**
     *to add a movie details in the system
     */
    public Movie acceptMovieDetails(Movie movie);

    /**
     * to find any movie details by providing movie id
     * @param movieId
     * @return
     * @throws MovieDetailsNotFoundException
     */

    public Movie getMovieDeatils(int movieId) throws MovieDetailsNotFoundException;

    /**
     * to get movie details by movie name
     */
    public Movie getMovieDeatailsByMovieName(String movieName) throws MovieDetailsNotFoundException;
    /**
     * to delete movie details form the system
     */
    public Boolean deleteMovieDetails(int movieId);

    /**
     * to find all the movie
     * @return
     */

    public List<Movie> getAllMovieDeails();

    /**
     * to find list of movie by duration
     */
    public List<Movie> getMovieByDuration(float duration);

}
