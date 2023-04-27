package com.king.bms.services;

import com.king.bms.entity.City;
import com.king.bms.entity.Theater;

import java.util.List;

public interface TheaterService {

    public Theater acceptTheterDetails(Theater theater);

    public Theater findTheaterByName(String theaterName);

    public List<Theater> getAllTheater();

    public Boolean deleteTheaterDetails(int theaterId);

    public List<Theater> findAllTheaterByCity(City city);
}
