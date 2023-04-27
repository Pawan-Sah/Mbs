package com.king.bms.exceptionHandler;

import com.king.bms.exceptions.MovieDetailsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MovieExceptionHandler {
    /**
     * use of the controller annotation enables this class to intercept any kind og exception
     */

    /**
     * neeed for movie details not found exception
     */
    @ExceptionHandler(MovieDetailsNotFoundException.class)
    public ResponseEntity handleMovieDetailsNotFoundException(){
        return new ResponseEntity("Movie id passed is not correct ", HttpStatus.BAD_REQUEST);

    }
}
