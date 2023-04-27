package com.king.bms.exceptions;

public class MovieNameNotFoundException extends Exception{
    MovieNameNotFoundException(String movieName){
        super(movieName);
    }
}
