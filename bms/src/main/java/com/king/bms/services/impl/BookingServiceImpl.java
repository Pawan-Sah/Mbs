package com.king.bms.services.impl;

import com.king.bms.dao.BookingDao;
import com.king.bms.entity.Booking;
import com.king.bms.exceptions.BookingDetailsNotFoundException;
import com.king.bms.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingDao bookingDao;
    @Override
    public Booking acceptBookingDetails(Booking booking) {
        return bookingDao.save(booking);
    }

    @Override
    public Booking getBookingBasedOnId(int bookingId) throws BookingDetailsNotFoundException {
        Booking findBooking=bookingDao.findById(bookingId).orElseThrow(()->new BookingDetailsNotFoundException("No any booking found by provided id :"+bookingId));
        return findBooking;
    }

    @Override
    public List<Booking> getAllBookingDeatils() {
        return bookingDao.findAll();
    }

    @Override
    public Boolean deleteBooking(int bookingId) {
        bookingDao.deleteById(bookingId);
        return true;
    }
}
