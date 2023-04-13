package com.king.bms.dao;

import com.king.bms.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Integer> {
    public City findByCityName(String cityName);
}
