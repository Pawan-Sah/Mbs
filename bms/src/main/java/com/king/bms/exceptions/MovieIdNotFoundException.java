package com.king.bms.exceptions;

public class MovieIdNotFoundException extends Exception{
    MovieIdNotFoundException(String movieName){
        super(movieName);
    }
}
