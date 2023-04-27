package com.king.bms.services.impl;

import com.king.bms.dao.MovieDao;
import com.king.bms.entity.Movie;
import com.king.bms.exceptions.MovieDetailsNotFoundException;
import com.king.bms.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    @Override
    public Movie acceptMovieDetails(Movie movie) {
        return movieDao.save(movie);
    }

    @Override
    public Movie getMovieDeatils(int movieId) throws MovieDetailsNotFoundException {
        Movie saveMovie=movieDao.findById(movieId).orElseThrow(()->new MovieDetailsNotFoundException("Movie details not found for the movie id : "+ movieId));
        return saveMovie;
    }

    @Override
    public Movie getMovieDeatailsByMovieName(String movieName) throws MovieDetailsNotFoundException {
        Movie findMovie=movieDao.findMovieByMovieName(movieName);
        if(findMovie==null)
            throw new MovieDetailsNotFoundException("we can not find information to input movie : "+movieName);
        else {
            return findMovie;
        }
    }

    @Override
    public Boolean deleteMovieDetails(int movieId) {
        movieDao.deleteById(movieId);
        return true;
    }

    @Override
    public List<Movie> getAllMovieDeails() {
        return movieDao.findAll();
    }

    @Override
    public List<Movie> getMovieByDuration(float duration) {
        return movieDao.findByDurationGreaterThanEqual(duration);
    }
}