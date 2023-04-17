package com.king.bms.services;

import com.king.bms.entity.City;
import com.king.bms.entity.Theater;
import com.king.bms.exceptions.CityDetailsNotFoundException;

import java.util.List;

public interface CityService {
    /**
     * to add a new city in the system
     */
    public City acceptCityDetails(City city);

    /**
     * to find city based in cityId
     */
    public City getCityById(int cityId) throws CityDetailsNotFoundException;

    /**
     * to find city based on city name
     */

    public City getCityByCityName(String cityName) throws CityDetailsNotFoundException;

    /**
     * to get all the city
     */
    public List<City> getAllCity();

    /**
     * to delete a city
     */
    public Boolean deleteCityDetail(int cityId);

    /**
     * to find all the theater in city
     */

    public List<Theater> getAllTheaterInCity(int cityId);
}
