package com.king.bms.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;
    private Date bookingDate;

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", bookingDate=" + bookingDate +
                '}';
    }

    public Booking(int bookingId, Date bookingDate) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
    }
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private  Movie movie;
    @OneToOne
    @JoinColumn(name = "status_id")
    private Status status;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    public Booking() {
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
}
