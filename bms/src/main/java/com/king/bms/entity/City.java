package com.king.bms.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.stream.Collectors;

@Entity

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cityId;

    @Column(length = 20,nullable = false)
    private String cityName;

    //private String location;
    @OneToMany(mappedBy = "city")
    private List<Theater> theaters;

    public City(String cityName) {
        this.cityName = cityName;
    }

    @OneToMany(mappedBy = "city")
    private List<Booking> bookings;

    public City() {
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                //", theaters=" + theaters.stream().map(Theater::getTheatername).collect(Collectors.toList()) +
                '}';
    }

    public City(int cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Theater> getTheaters() {
        return theaters;
    }

    public void setTheaters(List<Theater> theaters) {
        this.theaters = theaters;
    }
}
