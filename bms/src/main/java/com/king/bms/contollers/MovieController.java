package com.king.bms.contollers;


import com.king.bms.dtos.MovieDto;
import com.king.bms.entity.Movie;
import com.king.bms.exceptions.MovieDetailsNotFoundException;
import com.king.bms.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
   @Autowired
    private MovieService movieService;

//    @GetMapping
//    public ResponseEntity demo(){
//        return new ResponseEntity("hello world of pawan", HttpStatus.OK);
//    }
    @GetMapping
    public ResponseEntity getAllMovie(){
        List<Movie> movieList=movieService.getAllMovieDeails();
        List<MovieDto> movieDtoList=new ArrayList<>();
        for(Movie m:movieList){
            MovieDto movieDto=convertEntityToMovieDto(m);
            movieDtoList.add(movieDto);
        }
        return new ResponseEntity(movieDtoList,HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity createMovie(@RequestBody MovieDto movieDto){

        /**
         * we have to first convert movie DTO to entity
         */
        Movie movieEntity=convertMovieDtoToEntity(movieDto);
        Movie saveMovie=movieService.acceptMovieDetails(movieEntity);
        MovieDto responseBody=convertEntityToMovieDto(saveMovie);
        movieService.acceptMovieDetails(movieEntity);
        return new ResponseEntity(responseBody,HttpStatus.CREATED);
    }
    @DeleteMapping("/{demo_id}")
    public ResponseEntity deleteMovie(@PathVariable("demo_id") int movieId) throws MovieDetailsNotFoundException {
        Movie deleteMovie=movieService.getMovieDeatils(movieId);
        System.out.println(deleteMovie);
        movieService.deleteMovieDetails(movieId);
        return new ResponseEntity("Movie deleted with id : "+movieId, HttpStatus.OK);
    }
    @GetMapping("/{movie_name}")
    public ResponseEntity getMovieByName(@PathVariable("movie_name") String movieName) throws MovieDetailsNotFoundException {
        Movie findMovie=movieService.getMovieDeatailsByMovieName(movieName);
        MovieDto response=convertEntityToMovieDto(findMovie);
        return new ResponseEntity(response,HttpStatus.OK);
    }

//    @GetMapping("/{movie_id}")
//    public ResponseEntity getMovieById(@PathVariable("movie_id") String movieName) throws MovieDetailsNotFoundException {
//        Movie findMovie=movieService.getMovieDeatailsByMovieName(movieName);
//        MovieDto response=convertEntityToMovieDto(findMovie);
//        return new ResponseEntity(response,HttpStatus.OK);
//    }


    private MovieDto convertEntityToMovieDto(Movie saveMovie) {
        MovieDto movieDto=new MovieDto();
        movieDto.setMovieid(saveMovie.getMovieid());
        movieDto.setMovieName(saveMovie.getMovieName());
        movieDto.setMoviedescription(saveMovie.getMoviedescription());
        movieDto.setMovieTrailerUrl(saveMovie.getMovieTrailerUrl());
        movieDto.setDuration(saveMovie.getDuration());
        movieDto.setReleaseDate(saveMovie.getReleaseDate());
        movieDto.setCoverPhotoUrl(saveMovie.getCoverPhotoUrl());
        return movieDto;
    }

    private Movie convertMovieDtoToEntity(MovieDto movieDto) {
        Movie movie=new Movie();
        //movie.setMovieid(movieDto.getMovieid());
        movie.setMovieName(movieDto.getMovieName());
        movie.setMoviedescription(movieDto.getMoviedescription());
        movie.setMovieTrailerUrl(movieDto.getMovieTrailerUrl());
        movie.setDuration(movieDto.getDuration());
        movie.setCoverPhotoUrl(movieDto.getCoverPhotoUrl());
        movie.setReleaseDate(movieDto.getReleaseDate());
        return movie;
    }

}
