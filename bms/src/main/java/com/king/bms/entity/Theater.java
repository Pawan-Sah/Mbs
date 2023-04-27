package com.king.bms.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity

public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int theaterId;

    @Column(length = 20,nullable = false,unique = false)
    private String theatername;
    @Column(nullable = false)
    private float ticketPrice=200.00f;

    public Theater() {
    }

    public Theater(int theaterId, String theatername, float ticketPrice, City city, List<Movie> movies) {
        this.theaterId = theaterId;
        this.theatername = theatername;
        this.ticketPrice = ticketPrice;
        this.city = city;
        this.movies = movies;
    }

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheatername() {
        return theatername;
    }

    public void setTheatername(String theatername) {
        this.theatername = theatername;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Theater(String theatername, float ticketPrice, City city) {
        this.theatername = theatername;
        this.ticketPrice = ticketPrice;
        this.city = city;
    }

    @ManyToMany
    private List<Movie> movies;


    @Override
    public String toString() {
        return "Theater{" +
                "theaterId=" + theaterId +
                ", theatername='" + theatername + '\'' +
                ", ticketPrice=" + ticketPrice +
               // ", city=" + city +
               // ", movies=" + movies +
                '}';
    }
}
