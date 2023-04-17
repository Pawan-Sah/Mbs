package com.king.bms.services;

import com.king.bms.entity.Booking;
import com.king.bms.entity.Movie;
import com.king.bms.exceptions.BookingDetailsNotFoundException;

import java.awt.print.Book;
import java.util.List;

public interface BookingService {

    // to add a new booking
    public Booking acceptBookingDetails(Booking booking);

    //find booking by given id

    public Booking getBookingBasedOnId(int bookingId) throws BookingDetailsNotFoundException;

    //to getAllBooking
    public List<Booking> getAllBookingDeatils();

    // to delete Booking by id

    Boolean deleteBooking(int bookingId);

}
