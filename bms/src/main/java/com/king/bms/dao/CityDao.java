package com.king.bms.dao;

import com.king.bms.entity.City;
import com.king.bms.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityDao extends JpaRepository<City,Integer> {
    public City findByCityName(String cityName);

    public List<Theater> findAllTheaterByCityId(int cityId);
}
