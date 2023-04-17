package com.king.bms.services.impl;

import com.king.bms.dao.CityDao;
import com.king.bms.entity.City;
import com.king.bms.entity.Theater;
import com.king.bms.exceptions.CityDetailsNotFoundException;
import com.king.bms.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;
    @Override
    public City acceptCityDetails(City city) {
        return cityDao.save(city);
    }

    @Override
    public City getCityById(int cityId) throws CityDetailsNotFoundException {
        City findCity=cityDao.findById(cityId).orElseThrow(()->new CityDetailsNotFoundException(" Not find any city to provided city id :"+cityId));
        return findCity;
    }

    @Override
    public City getCityByCityName(String cityName) throws CityDetailsNotFoundException {
        City findCity=cityDao.findByCityName(cityName);
        if(findCity==null) {
            throw new CityDetailsNotFoundException(" Can not find any city by provided city name :" + cityName);
        }else {
            return findCity;
        }
    }

    @Override
    public List<City> getAllCity() {
        return cityDao.findAll();
    }

    @Override
    public Boolean deleteCityDetail(int cityId) {
        cityDao.deleteById(cityId);
        return true;
    }

    @Override
    public List<Theater> getAllTheaterInCity(int cityId) {
        return cityDao.findAllTheaterByCityId(cityId);
    }
}
